package zigZagConversion;

/**
 * Created by KTK on 18-Mar-22.
 */
public class ZigZagConversion {
    public static void main(String[] args) {
        ZigZagConversion zigzag = new ZigZagConversion();
        String inputString = "PAYPALISHIRING";
        int numRows = 3;
        String convertedString = zigzag.convert(inputString, numRows);
        System.out.println(convertedString);
    }

    public String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        //calculate the step value
        int stepValue = 0;
        for(int i = 0; i<numRows; i++){
            for(int j = 0; j<=chars.length;j++){
                if(i==numRows-1){

                }
            }
        }
        return "";
    }
}
