package EverythingForAccenture;

import java.util.ArrayList;

public class Filename_version {
    public static Integer check(String [] filenames) {
        if (filenames.length == 0) {
            return -1;
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (String filename : filenames) {
            int temp=0;
            try{
                temp = Integer.parseInt(filename.substring(5));
            } catch (NumberFormatException e) {
                continue;
                //throw new RuntimeException(e);
            }
            if (temp>=0) {
                res.add(temp);
            }
        }
        res.sort(Integer::compare);
        return res.getLast();
    }
    public static void main(String[] args) {
        String[] str = {"file_1","file_2","file_3","file_f4","file_5"};
        System.out.println(check(str));
        //System.out.println(check(new String[] {}));
    }
}
