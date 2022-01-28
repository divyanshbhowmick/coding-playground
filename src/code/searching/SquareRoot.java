package code.searching;

public class SquareRoot {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;
        while (l <= r) {
            // we are using this to avoid integer overflow..
            int mid = l + ((r - l) / 2);
            if (mid == 0)
                return 0;
            // we could have also gone with condn: x > mid*mid but as mid*mid can overflow integer therefore we used x/mid
            if (x / mid > mid)
                l = mid + 1;
            else if (x / mid < mid)
                r = mid - 1;
            else
                return mid;
        }
        return l - 1;
    }
}
