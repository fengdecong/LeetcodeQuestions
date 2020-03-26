//前K个高平单词
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> mp = new HashMap<>();
        for(String word : words){
            mp.put(word,mp.getOrDefault(word,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(new EntryComparator());
        for(Map.Entry<String,Integer> en : mp.entrySet()){
            pq.offer(en);
        }
        List<String> lst = new ArrayList<>();
        while(k-- != 0){
            lst.add(pq.poll().getKey());
        }
        return lst;
    }
}

//比较器
class EntryComparator implements Comparator<Map.Entry<String,Integer>>{
    @Override
    public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
        int diff = o2.getValue() - o1.getValue();
        if(diff == 0){
            return o1.getKey().compareTo(o2.getKey());
        }
        return diff;
    }
}