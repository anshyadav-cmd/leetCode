class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i : nums)
            sum += numberOfDivisors(i);
        return sum;
    }
    public int numberOfDivisors(int num)
    {
        int count = 0;
        int sum = 0;
        for(int i = 1; i*i <= num; i++)
        {
            if(count > 4)
                break;
            if(num % i == 0)
            {
                count += 2;
                sum += i + num / i;
                if(num / i == i)
                {
                    count--;
                    sum -= i;
                }
            }
        }
        if(count == 4)
            return sum;
        return 0;
    }
}