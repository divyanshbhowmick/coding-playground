package code.random.bitmanipulation;

class Joshephus {

    public static void main(String args[]){
        // This algo is used to calculate the value left after eleminating the alternate postions in range of numbers.
        // ans is first experess the number in the powers of 2 and + constant i.e : 2^n + l;
        // Ans = 2l+1;

        int n = 10;
        int inPowersof2 = getInPowerOf2(10); // 8 
        int l = n - inPowersof2;

        System.out.println(2 * l + 1);
    }

    public static int getInPowerOf2(int no) {
        int i = 1;
        while (i * 2 <= no) {
            i = (int) ((i * 2) % (1e9 + 10));
        }
        return i;
    }
}