import java.util.*;
import java.util.stream.Collectors;
record Person(String name,int age){}
public class Records{
    public static void main(String[] args) {
        Person p1=new Person("Alice",25);
        Person p2=new Person("Bob",17);
        Person p3=new Person("Charlie",30);

        System.out.println("Persons:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        List<Person> people=List.of(p1, p2, p3);

        List<Person> adults=people.stream()
                .filter(person -> person.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("\nAdults(age >= 18):");
        for(int i=0;i<adults.size();i++) {
            System.out.println(adults.get(i));
        }
    }
}
