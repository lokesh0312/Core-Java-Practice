package JavaPract;

public class SingleThreadEx {
    public static void main(String[] args) {
        SingleThreadEx st =new SingleThreadEx();
        st.Numbers();
        for (int j = 0; j < 20; j++) {
            System.out.println("print numbers:"+j);
        }
    }
    static void Numbers(){
        for (int i = 0; i < 10; i++) {
            System.out.println("print numbers:"+i);
        }
    }
}
