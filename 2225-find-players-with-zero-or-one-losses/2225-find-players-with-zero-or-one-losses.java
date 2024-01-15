class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> zeroLoss = new ArrayList<Integer>();
        List<Integer> OneLoss = new ArrayList<Integer>();

        for (int index = 0; index < matches.length; index++) {
            int zero = matches[index][0];
            int one = matches[index][1];
            int lenZero = map.containsKey(zero) ? map.get(zero) : 0;
            int lenOne = map.containsKey(one) ? map.get(one) : 0;

            map.put(zero,lenZero);
            map.put(one,lenOne+1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 0){
                zeroLoss.add(e.getKey());
            }
            if(e.getValue() ==1){
                OneLoss.add(e.getKey());
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        Collections.sort(zeroLoss);
        Collections.sort(OneLoss);
        result.add(zeroLoss);
        result.add(OneLoss);
        
        return result;
    }
}