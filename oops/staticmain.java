package oops;

public class staticmain {
    public static void main(String[] args) {
        staticImplements st=new staticImplements();
        st.setI1(2);
        st.setI2(3);
        st.display();
        staticImplements st2=new staticImplements();
        st2.setI1(4);
        st2.setI2(5);
        st2.display();
        System.out.println("After the updation of the elements of the variable");
        st.display();
    }
}
