public class BinarySearch
{
   public static int search(int[] nums, int target)
   {
      return search(nums, target, 0, nums.length - 1);
   }

   private static int search(int[] nums, int target, int low, int high)
   {
      if (high < low)
      {
         return -1;
      }

      int middle = (high + low) / 2;
      System.out.println(nums[middle]+ " " + low + " " + high);
      if (nums[middle] == target)
      {
         return middle;
      }

      if (target > nums[middle])
      {
         return search(nums, target, middle + 1, high);
      }

      if (target < nums[middle])
      {
         return search(nums, target, low, middle - 1);
      }
      return - 1;
   }

   public static void main(String[] args)
   {
      int[] nums = new int[]{ 1, 22, 45, 50, 51, 52, 100, 250};
      System.out.println(search(nums, 251));
   }
}
