class Solution {

    static boolean isArraySorted(ArrayList<Integer> a) {
        for (int index = 0; index < a.size()-1; index++) {
            if (a.get(index)>a.get(index+1)) {
                return false;
            }
        }
        return true;
    }

    public boolean check(int[] nums) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        for(int n : nums){
            a.add(n);
}
        
        for(int i =0;i<nums.length;i++){
            int lastElement = a.remove(a.size() - 1);
            a.add(0, lastElement);

            if(isArraySorted(a)){
                return true;
            }
        }
    return false;
    }
}
