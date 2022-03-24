package dividend;

public class DivideSolution {
    public static void main(String[] args) {
//        System.out.println(new DivideSolution().divide(7,-3));
//        System.out.println(new DivideSolution().divide(10,-3));
//        System.out.println(new DivideSolution().divide(-10,-3));
        System.out.println(new DivideSolution().divide(-2147483648 ,-1));

    }

    public int divide(int dividend, int divisor) {
        int sign = 1;
        if(dividend<0 && divisor>0|| dividend>0 && divisor<0){
            sign = -1;
        }
        long localDividend = Math.abs((long)dividend);
        long localDivisor = Math.abs((long)divisor);

        long quotioent = ldivide(localDividend,localDivisor);
        /*while((divisor + divisor)<=dividend){
            divisor += divisor;
            quotioent++;
        }*/

        if(sign == -1){
            return (int) (sign*quotioent);
        }

        return (int)quotioent;
    }


    private long ldivide(long ldividend, long ldivisor) {
        if (ldividend < ldivisor) return 0;
        long sum = ldivisor;
        long multiple = 1;
        while ((sum+sum) <= ldividend) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + ldivide(ldividend - sum, ldivisor);
    }
}
