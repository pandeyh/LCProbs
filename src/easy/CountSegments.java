package easy;

public class CountSegments {
    public int countSegments(String s) {

        if (s.isEmpty())
            return 0;

        int count =0;
        String[] words = s.split("\\s+");

        for(String word:words)
        {
            if(!word.isEmpty()){
                count++;
            }
        }
        return count;

    }

    public static void main(String args[]){
        CountSegments c = new CountSegments();
        int n = c.countSegments("    foo    bar");
        System.out.println(n);
    }
}
