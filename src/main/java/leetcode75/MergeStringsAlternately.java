package leetcode75;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        // both strings might be with the same length:
        int minLength = Math.min(length1, length2);
        String longerString = length1 > length2 ? word1 : word2;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(i));
        }
        stringBuilder.append(longerString.substring(minLength));

        return stringBuilder.toString();
    }
}
