package Javapaid.DivideAndConcoer;

public class SortedRotatedSearch {
    public static void main(String[] args) {
        int [] arr ={4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(searchSR(arr, target, 0, arr.length-1));
    }

    private static int searchSR(int[] arr, int target, int si, int ei) {
        //base
        if (si > ei) {
            return -1;
        }
        //work
        int mid = si+(ei-si)/2;

        //case found
        if (arr[mid] == target) {
            return mid;
        }
        //mid on L1
        if (arr[si] <= arr[mid]) {
            //case a: left
            if (arr[si]<= target && target<=arr[mid]){
                return searchSR(arr, target, si, mid-1);
            }else {//case b: right
                return searchSR(arr, target, mid+1, ei);
            }
        }else {//mid on L2
            //case c: right
            if (arr[mid]<= target && target<=arr[ei]){
                return searchSR(arr, target, mid+1, ei);
            }else {//case d: left
                return searchSR(arr, target, si, mid-1);
            }
        }
    }
}
