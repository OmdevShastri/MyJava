package AdventOfCode2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalcSumOfCalibrationNumbers {
    public static void main(String[] args) {
        String filePath = "src/AdventOfCode2023/SumOfCalibNumsData.txt";
        int sum =0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file until the end of the file is reached
            while ((line = reader.readLine()) != null) {
                // Process each line as needed
                sum+= process(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(process("bsihdjn4jh7hhg7bd6"));
        System.out.println(sum);
    }

    private static int process(String line) {

        StringBuilder ans = new StringBuilder();
        if (line.isEmpty()){
            return 0;
        }
        //first int
        for (int i = 0; i < line.length()/2; i++) {

            //int numPart = Integer.parseInt(String.valueOf(ch));
            //if (numPart>=0) {
//            int numPart = tryParse(String.valueOf(ch));
//            if (tryParse(String.valueOf(ch))!=null){
//                ans.append(tryParse(String.valueOf(ch)));
//            }
//            Objects.requireNonNull(ans).append(numPart);
            char ch = line.charAt(i);
            if (Character.isDigit(ch)){
                ans.append(Integer.parseInt(String.valueOf(ch)));
                break;
            }
        }
        //last int
        for (int i = line.length()-1; i> line.length()/2; i--) {
            char ch = line.charAt(i);
            if (Character.isDigit(ch)){
                ans.append(Integer.parseInt(String.valueOf(ch)));
                break;
            }
        }
        if (ans.isEmpty()){
            return 0;
        }
        if (ans.length()==1){
            ans.append(ans.toString());
        }
        return Integer.parseInt(ans.toString());
    }

//    public static Integer tryParse(String text) {
//        try {
//            return Integer.parseInt(text);
//        } catch (NumberFormatException e) {
//            return null;
//        }
//    }
}
