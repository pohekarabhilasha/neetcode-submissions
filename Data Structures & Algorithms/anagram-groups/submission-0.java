class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++)
        {
            String word = strs[i];
            char[] a = word.toCharArray();
            Arrays.sort(a);
           String key= Arrays.toString(a);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

       return new ArrayList<>(map.values());




    }
}
