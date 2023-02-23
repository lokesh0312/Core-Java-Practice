package JavaPract;

public class ArrPract {
    public static void main(String[] args) {
        String str="Lokesh", str1="";
        char ch;
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
        for(int i=0; i<str.length();i++){
            ch=str.charAt(i);
            str1=ch+str1;
        }
        System.out.println(str1);

    }
}
