/*You are given two strings, word1 and word2. Merge the strings alternately by taking letters from each string in order.
If one string is longer than the other, append the remaining letters at the end.
Return the merged string.

word1 = "abc", word2 = "ps"
Output: "apbcs"
 */

/*Approach :-
 * 
Use a StringBuilder to make building the new string easier.
Keep two counters, one for each string.
Go through both strings until you reach the end of both:
Take a character from the first string if there are still characters left.
Take a character from the second string if there are still characters left.
Return the final merged string from the StringBuilder

 */
public class Leetcode1768 {

    public static String mergeAlternatively(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l1 = 0;
        int l2 = 0;

        while (l1 < word1.length() || l2 < word2.length()) {
            if (l1 < word1.length()) {
                sb.append(word1.charAt(l1++));
            }
            if (l2 < word2.length()) {
                sb.append(word2.charAt(l2++));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "ps";

        String result = mergeAlternatively(word1, word2);

        System.out.println(result);

    }
}