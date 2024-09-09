package prep.day1;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(checkPrime(111117));
        System.out.println(checkPrime2(111117));
    }
    static boolean checkPrime(int no) {
        boolean flag = true;
        for (int i = 2; i < no; i++) {
            if(no % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    // TC:
    static boolean checkPrime2(int no) {
        return countFactor(no) == 2;
    }

    static int countFactor(int no) {
        int count = 0;
        for(int i = 1; i <= (int) Math.sqrt(no); i++){
            if(no % i == 0) {
                if (i == no/i) count++;
                else count+=2;
            }
        }
        return count;
    }

}
