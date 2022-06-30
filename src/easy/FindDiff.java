package easy;

public class FindDiff {

    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) {
            c ^= cs;
         }
        for(char ct : t.toCharArray()) {
            c ^= ct;
         }
        return c;
    }

    public static void main(String args[]){
        char c = new FindDiff().findTheDifference("abcd", "bcdea");
        System.out.print(c);

        System.out.print("");

    }
}
