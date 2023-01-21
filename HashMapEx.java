package JavaPract;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String>hmap=new HashMap<>();
        //LinkedHashMap<Integer, String>hmap=new LinkedHashMap<>();
        //TreeMap<Integer, String>hmap=new TreeMap<>();
        hmap.put(50,"Sergio Ramos");
        hmap.put(52,"Casemiro");
        hmap.put(51,"Virgil van Dijk");
        hmap.put(55,"Achraf Hakimi");
        hmap.put(54,"Cody Gakpo");
        hmap.put(53,"Karim Benzema");
        System.out.println("Sequential manner:"+hmap);
        System.out.println("Using for each:");
        for (Map.Entry i:hmap.entrySet()) {
            System.out.print("Key: "+i.getKey()+", ");
            System.out.println("Value:"+i.getValue());
        }
        System.out.println("Using iterator:");
        Set s = hmap.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext()){
            Map.Entry entr=(Map.Entry)i.next();
            System.out.print("Key: "+entr.getKey()+", ");
            System.out.println("Value:"+entr.getValue());
        }
    }
}
