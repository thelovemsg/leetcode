class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        /*int length = nums.length;
        int[] results = new int[length];
        for(int i=0; i<length; i++){
            int count=0;
            for(int j=0; j<length; j++){
                if(i==j)
                    continue;
                if(nums[i]>nums[j])
                    count++;
            }
            results[i] = count;
        }
        return results;*/
        
        /*
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i = 0 ; i < arr.length; i ++){
            al.add(arr[i]);
        }
        
        for(int i = 0 ; i < nums.length; i ++){
            arr[i] = al.indexOf(nums[i]);
        }
        return arr;*/
        
        int[] arr = new int[nums.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i ++){
            list.add(arr[i]);
        }
        for(int i=0; i<nums.length; i++){
            arr[i] = list.indexOf(nums[i]);
        }
        
        return arr;
    }
}