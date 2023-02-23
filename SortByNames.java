package JavaPract;

import java.util.*;

public class SortByNames {
    public static void main(String[] args) {
        List<Author> al=  new ArrayList<>();
        al.add(new Author("Lionel","Messi", "Argentina"));
        al.add(new Author("Cristiano","Ronaldo", "Portugal"));
        al.add(new Author("Kylian","Mbappe", "France"));
        al.add(new Author("Neymar","Jr", "Brazil"));
        al.add(new Author("Luca","Modric", "Crotia"));
        al.add(new Author("Sergio","Busquets", "Spain"));
        al.add(new Author("Thomas","Muller", "Germany"));
        Collections.sort(al);
        for(Author str:al){
            System.out.println(str.firstName+" "+str.lastName+" "+"and country played for:"+str.teamName);
        }
    }
}
