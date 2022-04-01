class Solution {
  public  int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            sum += findSum(i);
        }
        return sum;
    }
    private  int findSum(int val) {
        int sum = 0, count = 0;
        for(int i = 1 ; i*i <= val; i++) {
            if(count > 4){
                return 0;
            }
            if(val % i == 0) {
                sum += i;
                sum += (val / i);
                count += 2;
                if(val / i == i) {
                    count--;
                    sum -= i;
                }
            }
        }
        if(count  == 4) {
            return sum;
        }
        return  0;
    }
}