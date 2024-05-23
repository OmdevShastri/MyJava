package EverythingForAccenture;

public class BinaryStrOps {
    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        String str2 = "0C1A1B1C1C1B0A0";
        System.out.println(OperationsBinaryString(str));
    }

    private static int OperationsBinaryString(String str) {
        if (str == null){
            return -1;
        }
        String temp=null;
        int result=(int)str.charAt(0);

        for (int i = 1; i < str.length()-1; i+=2) {
            int a = str.charAt(i+1);
            if (str.charAt(i)=='A'){
                result &= a;
            }else if (str.charAt(i)=='B'){
                result |= a;
            }else if (str.charAt(i)=='C'){
                result ^= a;
            }else
                return 0;



        }

        return result;
    }
}
