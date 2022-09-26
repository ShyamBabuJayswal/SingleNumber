public class AppearOnce {
    public static int Singlenumber(int[] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];//return true if both are different

        }
        return ans;
    }
}
