package onboarding;

import java.util.ArrayList;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = 0;
        if (!isValid(pobi) || !isValid(crong)) {
            return -1;
        }
        Integer pobiScore = pobi.stream().reduce(0, (a, b) -> Math.max(calculateMaxValue(a), calculateMaxValue(b)));
        Integer crongScore = crong.stream().reduce(0, (a, b) -> Math.max(calculateMaxValue(a), calculateMaxValue(b)));
        if (pobiScore > crongScore) {
            answer = 1;
        } else if (pobiScore < crongScore) {
            answer = 2;
        }
        return answer;
    }
    private static boolean isValid(List<Integer> integers) {
        return isValid(integers.get(0), integers.get(1));
    }
    private static boolean isValid(Integer previousPage, Integer nextPage) {
        return nextPage - previousPage == 1;
    }

    private static int calculateMaxValue(Integer target) {
        int sum = 0;
        int multiply = 1;
        ArrayList<Integer> numberList = new ArrayList<>();
        while (target > 0) {
            numberList.add(Math.floorMod(target, 10));
            target = Math.floorDiv(target, 10);
        }
        for (Integer node: numberList) {
            sum += node;
            multiply *= node;
        }
        return Math.max(sum, multiply);
    }
}