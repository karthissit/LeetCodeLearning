package intToRoman;

public class IntegerToRoman {
    public static void main(String[] args) {
        IntegerToRoman obj = new IntegerToRoman();
        int[] arr = {0,2, 58, 48,304,40 ,200, 72,99, 508,999, 1994, 2000,3999};

        for (int i : arr) {
            String str = obj.intToRoman(i);
            System.out.println(str);
            //assert  str.equals(obj.test(i));
        }
    }


    public String intToRoman(int num) {
        StringBuilder romanNumber = new StringBuilder();
        if(num == 0){
            return romanNumber.toString();
        }
        int multiplyer = 1;
        while(num>0){
            int digit = (num % 10)*multiplyer;
            num = num / 10;
            StringBuilder sbtmp;
            sbtmp = convert(digit);
            sbtmp.append(romanNumber);
            romanNumber = sbtmp;
            multiplyer = multiplyer*10;
        }
        return romanNumber.toString();
    }

    private static StringBuilder convert(int digit) {
        StringBuilder sb = new StringBuilder();
        switch (digit) {
            case 1, 2, 3 -> sb.append("I".repeat(digit));
            case 4 -> sb.append("IV");
            case 5 -> sb.append("V");
            case 6, 7, 8 -> sb.append("V").append("I".repeat(digit-5));
            case 9 -> sb.append("IX");
            case 10 -> sb.append("X");
            case 40 -> sb.append("XL");
            case 50 -> sb.append("L");
            case 90 -> sb.append("XC");
            case 100 -> sb.append("C");
            case 400 -> sb.append("CD");
            case 500 -> sb.append("D");
            case 900 -> sb.append("CM");
            case 1000 -> sb.append("M");
        }
        if(sb.isEmpty() && digit!=0){
            if(digit>10&&digit<40){
                sb.append("X".repeat(digit/10));
            }else if(digit>50&&digit<90){
                sb.append("L").append("X".repeat(((digit-50)/10)));
            }else if(digit>100&&digit<400){
                sb.append("C".repeat((digit)/100));
            }else if(digit>500&&digit<900){
                sb.append("D").append("C".repeat(((digit-500)/100)));
            }else if(digit>1000){
                sb.append("M".repeat(digit/1000));
            }
        }
        return sb;
    }

    /*
     *Other solution from leet code discussion
     *  */
//    public String intToRoman(int num) {
//
//        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        StringBuilder result = new StringBuilder();
//        while(num > 0)
//        {
//            for(int i = 0 ; i < values.length; i++)
//            {
//                if(num >= values[i])
//                {
//                    result.append(roman[i]);
//                    num -= values[i];
//                    break;
//                }
//            }
//        }
//
//        return result.toString();
//    }


//    public String test(int i){
//        return switch (i){
//            case 0 -> "";
//            case 58 -> "LVIII";
//            case 48 -> "XLVIII";
//            case 40 -> "XL";
//            case 72 -> "LXXII";
//            case 508 -> "DVIII";
//            case 1994 -> "MCMXCIV";
//            case 66 -> "LXVI";
//            case 99 -> "XCIX";
//            case 999 -> "CMXCIX";
//            case 731 -> "DCCXXXI";
//            default -> "none";
//        };
//    }
}
