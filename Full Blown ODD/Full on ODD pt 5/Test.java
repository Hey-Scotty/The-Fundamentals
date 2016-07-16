public class Test{
    public void print(int[] nums)
    {
        for (int i = 0; i < nums.length; ++i)
            System.out.print(nums[i] + " ");
        System.out.println("\n");
    }

    public void foo(int[] nums)
    {
        this.print(nums);
        for (int i = 0; i < 10; ++i)
        {
            for (int j = 0; j < (nums.length - 1); ++j)
                if (nums[j] > nums[j + 1])
                {
                   int tmp = nums[j];
                   nums[j] = nums[j + 1];
                   nums[j+ 1] = tmp;
                }
            System.out.print(i + ": ");
            this.print(nums);
        }
    

   }
}   