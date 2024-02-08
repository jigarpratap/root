package JavaBasic;

public class StringFormat {
    public static void main(String[] args) {
        String str="java";
        StringBuffer sb=new StringBuffer(str);
        System.out.println(str.equals("Java"));
        System.out.println(str.contentEquals(sb));
        double d=45.65984;
        System.out.println("The value of double is: "+String.format("%.2f",d)); 
    }
}
