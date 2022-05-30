class Solution {
    public int divide(int d, int di) {
        if(d == Integer.MIN_VALUE && di == -1)
            return Integer.MAX_VALUE;
        
        long answer = 0 ;
        int sign = (d <0 && di > 0) || (d >0 && di < 0) ? -1:1;
        long  dividend = Math.abs((long) d);
        long divisor = Math.abs((long) di);
        
        while(dividend >= divisor){
            long temp = divisor;
            long count = 1;
            while(temp <<1 <= dividend ){
                temp = temp <<1;
                count = count<<1;
            }
            
            answer = answer + count;
            dividend = dividend - temp;
        }
        return sign*((int)answer);
   }
}