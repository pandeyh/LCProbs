package medium;

import java.util.*;


//https://leetcode.com/problems/top-k-frequent-words/description/
public class TopKFrequent {

    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> hMap = new HashMap<>();

        for(String word: words){

            hMap.put(word, hMap.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hMap.entrySet());

        Collections.sort(entryList, (entry1, entry2) -> {
            int freq = entry2.getValue().compareTo(entry1.getValue());

            if(freq != 0){
                return freq;
            }
            return entry1.getKey().compareTo(entry2.getKey());
        });

        List<String> res = new ArrayList<>();

        for(int i=0;i<k && i < entryList.size(); i++){
            res.add(entryList.get(i).getKey());
        }

        return res;


    }

    public static void main(String[] args) {
        TopKFrequent topKFrequent = new TopKFrequent();
        String[] words = {"the","is","is","sunny","the","the","the","sunny","is","is"};
        int k = 2;
        List<String> result = topKFrequent.topKFrequent(words, k);
        System.out.println(result);
    }

}
