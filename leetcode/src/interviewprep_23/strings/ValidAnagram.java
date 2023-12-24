package interviewprep_23.strings;

public class ValidAnagram {
    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (char ch: s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch: t.toCharArray()) {
            freq[ch - 'a']--;
        }
        for (int val: freq) {
            if (val > 0) return false;
        }
        return true;
     }

    public static void main(String[] args) {
        String str = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(str, t));
    }
}
