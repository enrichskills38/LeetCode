class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int word1Leng = word1.length();
        int word2Leng = word2.length();
        char[] word11 = word1.toCharArray();
        char[] word211 = word2.toCharArray();
        StringBuilder output = new StringBuilder();
        int maxLength = Math.max(word1Leng, word2Leng);

        for (int i = 0; i < maxLength; i++) {
            if (i < word1Leng) {
                output.append(word11[i]);
            }
            if (i < word2Leng) {
                output.append(word211[i]);
            }
        }
        
        return output.toString();
    }

    public static void main(String[] args) {
        String res1 = mergeAlternately("abc", "pqr");
        String res2 = mergeAlternately("ab", "pqrs");
        String res3 = mergeAlternately("abcd", "pq");
        
        System.out.println(res1); // Output: "apbqcr"
        System.out.println(res2); // Output: "apbqrs"
        System.out.println(res3); // Output: "apbqcd"
    }
}
