public class TwoPointers_TwoSumII {
    public static void main(String[] args) {
    int[] nums = {1, 2, 4, 6, 8, 9};
    int target = 10;
    int left =0;
    int right = nums.length - 1;
    while(left < right)
    {
        int sum = nums[left] + nums[right];
        {
            if (sum == target)
            {
                System.out.println("Indices of the two numbers are: " + left + " and " + right);
                break;
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

    }

    }
}