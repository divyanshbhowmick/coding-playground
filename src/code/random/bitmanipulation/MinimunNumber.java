import java.io.*;
 
class MinimunNumber
{
    public static int _popcnt32(long number)
    {
        int count = 0;
        while (number > 0)
        {
            count += number & 1L;
            number >>= 1L;
        }
        return count;
    }
     
    // Returns minimum number formed
    // by bits of a given number.
    static long minimize(long a)
    {
        // _popcnt32(a) gives number
        // of 1's present in binary
        // representation of a.
        int n = _popcnt32(a);
 
        return ((long)Math.pow(2, n) - 1);
    }
     
    // Driver Code.
    public static void main(String args[])
    {
        long a = 11;
        System.out.print(minimize(a));
    }
}