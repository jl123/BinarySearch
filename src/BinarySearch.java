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
         throw new ElementNotFoundError(String.valueOf(target));
      }

      int middle = (high + low) / 2;
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
      throw new ElementNotFoundError(String.valueOf(target));
   }

   public static void main(String[] args)
   {
      int[] nums = new int[]{ 1, 22, 45, 50, 51, 52, 100, 250};
      int target = 52;

      try
      {
         System.out.println(target + " found at index " + search(nums, target));
      }
      catch (ElementNotFoundError e)
      {
         System.out.println(e.getMessage());
      }
   }
}

class ElementNotFoundError extends Error
{
   ElementNotFoundError(String s)
   {
      super(s + " not found.");
   }
}