class Solution {
    public boolean isPalindrome(int x) {
         if(x >= 0){
            int reverse = 0, temp = x;
            while (x > 0) {
                reverse *= 10;
                reverse += x % 10;
                x /= 10;
            }
            if(reverse == temp){
                return  true;
            }
        }
        return false;
    }
}