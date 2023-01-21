package JavaPract;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {

        //HashSet<String> hset=new HashSet<>();
        //LinkedHashSet<String> hset=new LinkedHashSet<>();
        TreeSet<String>hset=new TreeSet<>();
        hset.add("La Liga");
        hset.add("Premier League");
        hset.add("Bundesliga");
        hset.add("Ligue 1");
        hset.add("Serie A");
        hset.add("Copa Del Rey");
        System.out.println("Sequential manner:"+hset);
        hset.remove("Copa Del Rey");
        System.out.println("Sequential manner:"+hset);
        ArrayList<String> num=new ArrayList<>();
        num.add("1");
        num.add("2");
        num.add("3");
        HashSet<String> newset=new HashSet(num);
        newset.add("4");
        System.out.println(newset);
        System.out.println("Using Iterator:");
        Iterator i=hset.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Using for each:");
        for (String str:
             hset) {
            System.out.println(str);
        }
    }
}
