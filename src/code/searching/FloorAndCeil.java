package code.searching;

public class FloorAndCeil {
    public static void main(String[] args) {
        // floorAndCeil(new int[] { 1, 2, 8, 10, 10, 12, 19 }, 0);
        // floorAndCeil(new int[] { 1, 2, 8, 10, 10, 12, 19 }, 1);
        // floorAndCeil(new int[] { 1, 2, 8, 10, 10, 12, 19 }, 5);
        // floorAndCeil(new int[] { 1, 2, 8, 10, 10, 12, 19 }, 20);
        floor(new int[] { 2, 2, 4, 10, 20, 25, 30 }, 1);
    }

    static void floorAndCeil(int arr[], int target) {
        int start = 0, end = arr.length - 1, mid, ceil = Integer.MAX_VALUE, floor = Integer.MIN_VALUE;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                ceil = arr[mid];
                end = mid - 1;
            } else if (arr[mid] < target) {
                floor = arr[mid];
                start = mid + 1;
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println(floor + " :: " + ceil);
    }

    // Main logic is :
    /**
     * normal case the answer lies between : start... target.... end :
     * if we get the target in the search array then we directly return it. but if
     * we dont get.. then it will lie between
     * 
     * end... target...start
     * 
     * as the above case is required to break the loop or get out of the loop, it
     * will hapeen at some point when we have last element
     * in the searching space..
     * 
     * so at that point.. end will refer to the floor as it points to the smaller
     * element than the target
     * and start will refer to the ciel as it points to the greater element than
     * target..
     * equal is not in the picture as it would have been returned by mid..
     * 
     */
    static int floor(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        // check whether any valid element is there or not...
        if (target < arr[start]) {
            System.out.println("No valid element found");
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println(arr[mid]);
                return mid;
            }
        }
        System.out.println(arr[end]);
        return end;
    }

    static int ceil(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        // check whether any valid element is there or not...
        if (target > arr[end]) {
            System.out.println("No valid element found");
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println(arr[mid]);
                return mid;
            }
        }
        System.out.println(arr[start]);
        return start;
    }
}
