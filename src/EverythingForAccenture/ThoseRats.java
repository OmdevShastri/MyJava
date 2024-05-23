package EverythingForAccenture;

import java.util.Scanner;

public class ThoseRats {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int [] arr = {2, 8, 3, 5, 7, 4, 1, 2};

        System.out.println(func(r, unit, arr));

    }

    private static int func(int r, int unit, int[] arr) {
        if (arr==null)
            return -1;
        int totEat = r*unit;
        int sum = 0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
            if (sum>totEat)
                break;
        }
        if (totEat>sum)
            return 0;

        return count;
    }
}
