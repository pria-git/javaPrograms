public class Lab009 {

    public static void main(String[] args) {
        int a= 87;
        long b= 91;
        String s1 ="kk";
        String s2 ="vv";
        System.out.println(s1+s2+a+b); //kkvv8791
        System.out.println(a+b+s1+s2); //178kkvv
        System.out.println(s1+s2+(a+b)); //kkvv178
    }
}
