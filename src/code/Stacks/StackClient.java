

public class StackClient{
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(1);
        st.display();
        Integer ir = st.pop();
        System.out.println(ir);

        ir = 2000;
        System.out.println(ir);
        // st.pop();
        st.display();
    }
}