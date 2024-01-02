class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<List<Integer>> result = new ArrayList<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);

            }
        }

        while (!map.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> keysToRemove = new ArrayList<>();

            for(Integer key:map.keySet()){
                if(map.get(key)>0){
                    map.put(key,map.get(key)-1);
                    temp.add(key);
                    if (map.get(key) == 0) {
                        keysToRemove.add(key);
                    }
                }
            }
            for (Integer keyToRemove : keysToRemove) {
                map.remove(keyToRemove);
            }
            result.add(temp);

        }
        return result;
        
    }
}