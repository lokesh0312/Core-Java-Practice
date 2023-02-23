package JavaPract;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> AList = new ArrayList<>();
        AList.add("Title");
        AList.add("Speed");
        AList.add(0, "Product");
        for (String i:AList)
            System.out.println(i);
    }
}

