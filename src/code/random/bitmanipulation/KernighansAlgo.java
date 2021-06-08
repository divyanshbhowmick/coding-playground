class KernighansAlgo {

    public static void main(String args[]){
        // This algo is used to calculte the number of sets bits in a number using time complexity O(k) where K is the number of set bits in the no.
        int n = 57;
        int counter = 0;
        while (n > 0){
            int rsb = n & -n;
            n = n - rsb;
            count++;
        }
        System.out.println(count);
    }
}