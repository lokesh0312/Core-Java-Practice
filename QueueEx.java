package JavaPract;

import com.sun.jdi.ArrayReference;

import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> qu = new LinkedList<>();
        qu.add("Vinicius Jr");
        qu.add("Kevin De Bryune");
        qu.add("Rodrygo");
        qu.add("Dy Bala");
        qu.remove("Kevin De Bryune");
        System.out.println(qu);
//        qu.poll();
//        System.out.println(qu);
        for (String str : qu) {
            System.out.println(str);

        }
    }
    }
