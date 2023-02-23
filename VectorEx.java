package JavaPract;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector vector=new Vector(6,3);
        vector.addElement("Manchester City");
        vector.addElement("Arsenal");
        vector.addElement("Liverpool");
        vector.addElement("Manchester United");
        vector.addElement("Tottenham Hotspur");
        vector.addElement("New Castle United");
        System.out.println("Initial Capacity is "+ vector.size());
        System.out.println("Capacity Increment is "+vector.capacity());
        vector.addElement("Chelsea");
        System.out.println("Initial Capacity is "+ vector.size());
        System.out.println("Capacity Increment is "+vector.capacity());

        Enumeration en = vector.elements();
        System.out.println("Premier League:");
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
