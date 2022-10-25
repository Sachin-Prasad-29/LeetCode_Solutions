class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for( int i = 0 ; i < n; i++){
            if(map.containsKey(target-arr[i])){
                result[0] = map.get(target-arr[i]);
                result[1] = i;
            }else{
                map.put(arr[i],i);
            }
        }
        return result;
    }
}