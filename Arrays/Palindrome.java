class Solution {


    private boolean checkisPalindrome(String str)
    {
        int left = 0;
        int right = str.length() - 1;

        while(left < right)
        {
         if(str.charAt(left) != str.charAt(right))
         {
            return false;
         }
         left++;
         right--;
        }

        return true;
    }
    public boolean isPalindrome(int x)
    {
      if(x < 0)
      {
        return false;
      }

      String str = x + "";

      return checkisPalindrome(str);  
    }
}