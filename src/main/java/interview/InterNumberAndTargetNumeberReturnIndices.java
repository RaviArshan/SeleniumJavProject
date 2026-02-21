package interview;

public class InterNumberAndTargetNumeberReturnIndices {
    public static void main(String[] args) {
        int nums[]={3,2,4};
        int target1=68;
       int result[]= interNumberAndTargetNumeberReturnIndices(nums, target1);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // Output: [1, 2]
    }

    public static int[] interNumberAndTargetNumeberReturnIndices(int nums[],int target)
    {

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};  // creates and returns an array containing two integers, i and j. These are the indices
        // of the two numbers that add up to the given target.
    }
}
