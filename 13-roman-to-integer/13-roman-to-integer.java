class Solution {
    public int romanToInt(String s) {
        int num = 0;
        Map<Character, Integer> romanInt = new HashMap<>();
        romanInt.put('I',1);
        romanInt.put('V',5);
        romanInt.put('X',10);
        romanInt.put('L',50);
        romanInt.put('C',100);
        romanInt.put('D',500);
        romanInt.put('M',1000);

        for(int i = 0; i < s.length() - 1; i++) {
            if(romanInt.get(s.charAt(i)) < romanInt.get(s.charAt(i + 1))){
                num -= romanInt.get(s.charAt(i));
            }else {
                num += romanInt.get(s.charAt(i));
            }
        }
        num += romanInt.get(s.charAt(s.length() - 1)) ;
        return num;
    }
}