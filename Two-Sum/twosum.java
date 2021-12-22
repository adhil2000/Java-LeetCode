class Solution {
   public int[] twoSum(int[] numbers, int target) {
    int[] arr = new int[2];  // array to hold indexs of integers
    Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // create HashMap
    //scan map
    for (int i = 0; i < numbers.length; i++) 
    {
        // meet criteria?
        if (map.containsKey(target - numbers[i])) 
        {
            arr[1] = i;
            arr[0] = map.get(target - numbers[i]);
            return arr;
        }
        // put in map otherwise
        map.put(numbers[i], i);
    }
    return arr;
    }
}
