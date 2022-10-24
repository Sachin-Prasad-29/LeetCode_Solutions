/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(arr, target) {
    const map = new Map();
    for(let i = 0 ; i < arr.length;i++){
        if(map.has(target-arr[i])){
            return [map.get(target-arr[i]),i]
        }else{
            map.set(arr[i],i);
        }
    }
   return []
};