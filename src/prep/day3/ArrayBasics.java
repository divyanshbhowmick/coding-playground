package prep.day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayBasics {
    public static void main(String[] args) {

        // Reverse
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int temp = 0;
//        Arrays.stream(arr).forEach(System.out::print);
//        for (int i =0 ; i <= (n / 2) - 1; i++){
//           temp = arr[n-1-i];
//           arr[n-1-i]=arr[i];
//           arr[i] = temp;
//        }
//        System.out.println();
//        Arrays.stream(arr).forEach(System.out::print);
//        reverse(arr, 2, 4);
//        System.out.println();
//        Arrays.stream(arr).forEach(System.out::print);
//        System.out.println();
        Arrays.stream(arr).forEach(System.out::print);
        int ar[] = rotate(arr, 4);
        System.out.println();
        Arrays.stream(ar).forEach(System.out::print);
        HashMap<Integer, List<Integer>> map = new HashMap<>();
//        map.getOrDefault()
        map.forEach((k,v) -> {

        });
    }

    static void reverse(int arr[], int s, int e){
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++; e--;
        }
    }

    static int[] rotate(int arr[], int times) {
//        [1,2,3,4,5,6]  ----->4 times rotates----> [3,4,5,6,1,2]

        int rotatedStartIdx = arr.length - times;
        int[] arrNew = Arrays.copyOf(arr, arr.length);
        System.out.println(rotatedStartIdx);
        for(int i = 0, idx = rotatedStartIdx; idx < arr.length; i++, idx++){
            System.out.println(i);
            arrNew[i] = arr[idx];
        }
        for(int i = rotatedStartIdx + 1, idx = 0; idx < rotatedStartIdx; i++, idx++){
            arrNew[i] = arr[idx];
        }
        return arrNew;
    }
}
