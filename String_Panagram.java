public class String_Panagram {
    public static void main(String[] args) {
//         Panagram - String containing all the 26 (alphabets)characters a to z.
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagramm(str.toLowerCase()));

    }
    private static boolean isPanagramm(String str) {
        if(str.length()<26){
            return false;
        }else {
            for(char ch='a'; ch<='z'; ch++){
                if(str.indexOf(ch) < 0){
                    return false;
                }
            }
        }
        return true;
    }
}
