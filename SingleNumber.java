public class SingleNumber {
        public int singleNumber(int[] nums)  //to check whether there is any occurance of no. is more than once and print the no. which appear once
        {
        //    int a=nums[0];
            int result=0;
         /*   if(nums.length<2) return nums[0];
            for(int i=0;i<nums.length;i++)
            {
                if(a!=nums[i])
                {
                    result=a;
                }
            }
            return result;
            */
            for(int num:nums)
            {
                result=result^num;
            }
            return result;
    
        }
}
