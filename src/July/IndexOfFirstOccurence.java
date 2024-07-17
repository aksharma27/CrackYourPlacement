package July;

public class IndexOfFirstOccurence {
    static int strStr(String haystack, String needle) {
        final int m = haystack.length();
        final int n = needle.length();

        for (int i = 0; i < m - n + 1; ++i)
            if (haystack.substring(i, i + n).equals(needle))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String target = "eet";     //try for "leeto" : return - 1
        System.out.println(strStr(s, target));
    }
}
