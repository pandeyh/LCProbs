package easy;

import java.util.HashSet;

public class Pangram {

    // not very efficient
    public boolean checkIfPangramHashSet(String sentence) {

        HashSet<Character> cSet = new HashSet();

        for(int i=0;i<sentence.length(); i++){
            cSet.add(sentence.charAt(i));
        }

        for(int i=97;i<=122; i++){
            if(!cSet.contains((char)i)){
                return false;
            }
        }
        return true;
    }

    // Fast O(n)
    public boolean checkIfPangram(String sentence) {

        for(int i=97;i<=122; i++){
            if(sentence.indexOf((char)i) < 0){
                return false;
            }
        }
        return true;
    }

}
