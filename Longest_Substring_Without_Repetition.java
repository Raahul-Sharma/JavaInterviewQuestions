import java.util.HashSet;

public class Longest_Substring_Without_Repetition {
    public static void main(String[] args) {
        String str = "abcdabcdabcdeabcf";
        System.out.println(Longest(str));
    }

    private static String Longest(String str) {
        HashSet<Character> hs = new HashSet<>();
        String longestTillNow = "";
        String longestOverall = "";

        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(hs.contains(c)){
                longestTillNow = "";
                hs.clear();
            }
            hs.add(c);
            longestTillNow += c;

            if(longestTillNow.length() > longestOverall.length()){
                longestOverall = longestTillNow;
            }
        }
        return longestOverall;
    }
}
