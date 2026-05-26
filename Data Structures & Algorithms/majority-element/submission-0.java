class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Hashtable<Integer,Integer> hash=new Hashtable<>();
        for(int i=0;i<n;i++)
        {
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);

            if(hash.get(nums[i])>(n/2))
        {
            return nums[i];
        }      
        }
            return -1;
    }
}