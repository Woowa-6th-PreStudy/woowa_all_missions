package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int current = 0;
        int answer = 0;
        while (current <= number) {
            answer += calculateClapCount(current);
            current++;
        }
        return answer;
    }
    private static Integer calculateClapCount (Integer target) {
        int count = 0;
        while (target > 0) {
            int last = target % 10;
            if (last == 3 || last == 6 || last == 0) {
                count += 1;
            }
            target = Math.floorDiv(target, 10);
        }
        return count;
    }
}
