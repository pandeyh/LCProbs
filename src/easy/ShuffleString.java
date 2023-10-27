package easy;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {

        StringBuilder sb = new StringBuilder();

        char [] ans = new char[indices.length];

        for (int i=0;i<s.length();i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }

    public static void main(String args[]) {

        int []n = {3,1,4,2,0};
        String s = new ShuffleString().restoreString("aiohn",n );
        System.out.print(s);
    }
}
