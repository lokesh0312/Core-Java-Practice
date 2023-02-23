package JavaPract;

public class Author implements Comparable<Author> {
        String firstName;
        String lastName;
        String teamName;
        Author(String first, String last, String team){
            this.firstName=first;
            this.lastName=last;
            this.teamName =team;
        }

        public int compareTo(Author au){
            int last =this.lastName.compareTo(au.lastName);
            return last == 0 ?this.firstName.compareTo(au.firstName) : last;
        }
    }
