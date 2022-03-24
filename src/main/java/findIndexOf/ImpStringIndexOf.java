package findIndexOf;

public class ImpStringIndexOf {

    public static void main(String[] args) {
        String hayStack = "a";
        String needle = "";
        System.out.println(new ImpStringIndexOf().strStr(hayStack,needle));
    }

    public int strStr(String haystack, String needle) {

        char[] hayStackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        if(needleArr.length == 0){
            return 0;
        }
        if (hayStackArr.length < needleArr.length ){
            return -1;
        }
        if(haystack.contains(needle)){
            char findChar= needleArr[0];
            for(int i = 0; i<hayStackArr.length; i++){
                if(hayStackArr[i] == findChar){
                    int k = 0;
                    boolean found = false;
                    for (int j = i; j < needleArr.length-1; j++) {
                        if(hayStackArr[j] != needleArr[k]){
                            break;
                        }
                        k++;
                    }
                }
            }
        }else{
            return -1;
        }
        return -1;
    }
}
