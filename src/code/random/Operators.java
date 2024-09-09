package code.random;

public class Operators {

    public static void main(String[] args) {

        for (int i = 0; i < 10; ++i){
            int j = ++i;
            System.out.println(i + ","+j);
        }
        System.out.println("*****************");
        for (int i = 0; i < 10; i++){
            int j = i++;
            System.out.println(i + ","+j);
        }

        System.out.println("::Range Demonstration::");
        int j = 10;
        for (int i = 1; i <= j; i++){
            System.out.println("Range="+(j-i+1));
        }
    }
}
