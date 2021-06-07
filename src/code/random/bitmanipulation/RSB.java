class RSB {

    public static void main(String args[]){
        // RSB is right most set bit.
        int n = 76;
        // Two's complement of a number (n)is equal to -n
        int rsb_n = (n & -n);
        // int rsb_n = n & n'' (two complement of n) 
        int rsb_n2 = (n & (~n + 1));
        System.out.println(rsb_n2);
        System.out.println(rsb_n);
    }
}