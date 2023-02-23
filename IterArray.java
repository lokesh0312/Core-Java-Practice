package JavaPract;

import java.util.ArrayList;
import java.util.Iterator;

public class IterArray {
    public static void main(String[] args) {
                ArrayList<String> AList = new ArrayList<>();
                AList.add("Title");
                AList.add("Speed");
                AList.add("Memory");
                AList.add(1, "Product");

        Iterator i=AList.iterator();
        while (i.hasNext()){
            String name=(String)i.next();
            System.out.println(name);
        }
            }
        }

