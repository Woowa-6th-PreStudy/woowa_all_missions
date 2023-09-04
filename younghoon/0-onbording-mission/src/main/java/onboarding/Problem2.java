package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem2 {
    public static String solution(String cryptogram) {
        boolean isDuplicate = true;
        while (cryptogram.length() > 0 && isDuplicate) {
            cryptogram = removeDuplicateWord(cryptogram);
            isDuplicate = isDuplicateString(cryptogram);
        }
        return cryptogram;
    }
    private static String removeDuplicateWord(String cryptogram) {
        ArrayList<String> stack = new ArrayList<>();
        String[] words = cryptogram.split("");
        boolean ignoreLastNode = false;
        for (String word: words) {
            int size = stack.size();
            if (size == 0) {
                stack.add(word);
            } else {
                if (ignoreLastNode) {
                    stack.add(word);
                    ignoreLastNode = false;
                } else {
                    String last = stack.remove(size - 1);
                    if (word.equals(last)) {
                        // 단어가 같은 경우
                        ignoreLastNode = true;
                    } else {
                        // 다른 단어의 경우
                        stack.addAll(Arrays.asList(last, word));
                    }
                }

            }
        }
        return String.join("", stack);
    }

    private static boolean isDuplicateString(String cryptogram) {
        boolean isExist = false;
        Set<String> hashSet = new HashSet<>();
        String[] words = cryptogram.split("");
        for (String word: words) {
            if (hashSet.contains(word)) {
                isExist = true;
                break;
            } else {
                hashSet.add(word);
            }
        }
        return isExist;
    }
}
