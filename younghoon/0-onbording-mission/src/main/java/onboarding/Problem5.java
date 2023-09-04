package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> currencyRange = Arrays.asList(50_000, 10_000, 5_000, 1_000, 500, 100, 50, 10, 1);
        for (Integer current: currencyRange) {
            int i = Math.floorDiv(money, current);
            answer.add(i);
            money = Math.floorMod(money, current);
        }
        return answer;
    }
}
