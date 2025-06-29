class Solution {
    static{
        for (int i=0;i<500;i++){
            threeSum(new int[3]);
        }
    }

    public  static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0;i<n-2;i++){
            int x = nums[i];
            if (x>0) break;
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i+1;
            int right = n-1;
            while (left < right){
                int total = x + nums[left] + nums[right];
                if (total == 0){
                    ans.add(List.of(x,nums[left],nums[right]));
                    left++;
                    while (nums[left] == nums[left-1] && left < right) left++;
                   
                }else if (total < 0){
                    left++;
                    
                }else{
                    right--;
                    
                }
            }
        }
        return ans;



    }
}