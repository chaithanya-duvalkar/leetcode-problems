public class FirstLastPos {
        public int[] searchRange(int[] nums, int target) {
            int first_pos=first_pos(nums,target);
            int last_pos=last_pos(nums,target);
            return new int[]{first_pos,last_pos};
        }
    
        private int first_pos(int[] nums,int target)
        {
            int left=0,right=nums.length-1,first=-1;
            while(left<=right)
            {
                int mid=(left+right)/2;
    
                if(nums[mid]>=target)
                {
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
                if(nums[mid]==target)
                {
                    first=mid;
                }
            }
            return first;
        }
    
         private int last_pos(int[] nums,int target)
        {
            int left=0,right=nums.length-1,last=-1;
            while(left<=right)
            {
                int mid=(left+right)/2;
    
                if(nums[mid]<=target)
                {
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
                if(nums[mid]==target)
                {
                    last=mid;
                }
            }
            return last;
        }
}
