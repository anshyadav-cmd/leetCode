class Solution {
    public int myAtoi(String s) {
        s = s.trim();
       if(s.equals("")) return 0;
       int negative = 1;
       int i = 0, val= 0;
       s = s.replaceAll("[^0-9+-].*", "");
       
       if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
           if(s.charAt(i) == '-') negative = -1;
           i++;
       }

       while(i < s.length() && (s.charAt(i) >= '0' || s.charAt(i) <= 9)) {
           if(val > Integer.MAX_VALUE/10 || (val == Integer.MAX_VALUE/10 && s.charAt(i) - '0' > 7) ) {
               if(negative == -1) {
                   return Integer.MIN_VALUE;
               }
               return Integer.MAX_VALUE;
           }
           val = val * 10 + (s.charAt(i++) - '0');
       }
       return negative * val;
    }
}