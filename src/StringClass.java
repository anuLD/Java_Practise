import java.util.stream.IntStream;

public class StringClass {
    public static boolean isPalindromeString(String inputString)
    {
        String tempString = inputString.replaceAll("\\s+", "").toLowerCase();

        return IntStream.range(0, tempString.length() / 2)
                .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }


    public static void main(String[] args)
    {
        System.out.println(isPalindromeString("refer"));
    }

}
