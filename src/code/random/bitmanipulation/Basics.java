package code.random.bitmanipulation;

class Basics {

    public static void main(String args[]){
        int n = 25;
        int i = 3; // turn on the 3rd bit if off
        int j = 4; // turn off the 4th bit if on 
        int k = 3; // toggle the 3rd bit
        int l = 3; // check whether the 3rd bit is on or off.
        // Preparing the masks for the above operations.
        int onMask = (1 << i);
        int offMask = ~(1 << j);
        int toggleMask = (1 << k);
        int checkMask = (1 << l);

        
        System.out.println(n | onMask);
        System.out.println(n & offMask);
        System.out.println(n ^ toggleMask);
        System.out.println((n & checkMask) == 0 ? "off" : "on");
    }
}