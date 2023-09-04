package onboarding;

public class Problem4 {

    public static String solution(String word) {
        StringBuilder answer = new StringBuilder();
        String[] stringList = word.split("");
        for (String str: stringList) {
            answer.append(int2String(getAsciiCode(str)));
        }
        return answer.toString();
    }

    private static String int2String(int target) {
        return Character.toString((char) target);
    }

    private static int getAsciiCode(String str) {
        int lowerStart = 97; // 소문자 'a'의 아스키코드
        int lowerEnd = 122; // 소문자 'z'의 아스키코드
        int upperStart = 65; // 대문자 'A'의 아스키코드
        int upperEnd = 90; // 대문자 'Z'의 아스키코드
        int target = str.charAt(0);
        if (target >= lowerStart && target <= lowerEnd) {
            int diff = target - lowerStart;
            target = lowerEnd - diff;
        }
        if (target >= upperStart && target <= upperEnd) {
            int diff = target - upperStart;
            target = upperEnd - diff;
        }
        return target;
    }
}
