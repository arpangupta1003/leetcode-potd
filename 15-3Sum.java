class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<nums.length-2;i++)
        {
            int ele=nums[i];
            int l=i+1;
            int r=nums.length-1;
            
            while(l<r)
            {
                if(nums[l]+nums[r]<-ele)
                {
                    l++;
                }
                else if(nums[l]+nums[r]>-ele)
                {
                    r--;
                }
                else if(nums[l]+nums[r]==-ele)
                {
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(ele);
                    tmp.add(nums[l]);
                    tmp.add(nums[r]);
                    ans.add(tmp);
                    l++;
                    r--;
                }
            }
            
        }
        return new ArrayList<>(ans);
    }
}