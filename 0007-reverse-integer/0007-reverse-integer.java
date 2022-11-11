class Solution {
    public int reverse(int x) {
        int max =(int)Math.pow(2,31);
        int min = max * -1;
        max--;
        boolean isNegative = false;
        if(x < 0){
            isNegative = true;
            x = x * -1;
        }
        long val = 0;
        while(x > 0){
            val = (val*10) + (x % 10);
            x = x/10;
        }
        // System.out.println(val);
        // System.out.println(max+ " " + min);
        if(isNegative) val = val * -1;
        
        if(val > max || val < min) return 0;
        return (int)val;
        
    }
}