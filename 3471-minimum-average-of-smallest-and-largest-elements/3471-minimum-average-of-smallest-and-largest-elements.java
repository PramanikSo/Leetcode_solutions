class Solution {
    public double minimumAverage(int[] nums) {
         Arrays.sort(nums);
        List<Double> list = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int min = nums[left];
            int max = nums[right];
            list.add((min + max) / 2.0);
            left++;
            right--;
        }
        
        double mavg = Double.MAX_VALUE;
        for (double avg : list) {
            if (avg < mavg) {
                mavg = avg;
            }
        }
        
        return mavg;
        
    }
}