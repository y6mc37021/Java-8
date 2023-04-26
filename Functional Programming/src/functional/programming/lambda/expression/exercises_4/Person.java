package functional.programming.lambda.expression.exercises_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Comparator;
 
public class Person {
 
    public enum Sex {
        MALE, FEMALE
    }
 
    String name;
    int age;
    Sex sex;
    String emailAddress;
 
    public int getAge() {
        return age;
    }
 
    public void printPerson() {
        System.out.println("Name: " + name + " Sex: " + sex + " Age: " + age + " Email: " + emailAddress);
    }
 
    public Sex getSex(){
        return sex;
    }
 
    public String getName() {
        return name;
    }
 
    public Person(String name, Sex sex, int age, String emailAddress){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.emailAddress = emailAddress;
    }
 
    public static void printMaleNames(List<Person> persons){
        
    	//Before Java 8
    	for (Person p : persons) {
            if (p.getSex() == Person.Sex.MALE) {
                System.out.println(p.getName());
            }
        }

    	//After Java 8
       System.out.println("--- Start - Java 8 Way ----");
       persons.stream()
       .filter(p->p.getSex()==Person.Sex.MALE)
       .forEach(fox -> System.out.println(fox.getName()));
       System.out.println("--- End - Java 8 Way ----");
    }
 
    public static void printUniqueFemaleNamesByLength(List<Person> persons){
        // Use a Set to get uniqueness. 
        Set<String> names = new HashSet<>();
        for (Person p : persons)
            if (p.getSex() == Person.Sex.FEMALE)
                names.add(p.getName());
        
        // Move to List for sorting (sets don't have order!)
        List<String> uniqueNames = new ArrayList<>(names);
        Collections.sort(uniqueNames, new Comparator<String>() {
                           public int compare(String s1, String s2) {
                               return s1.length() - s2.length();
                           }});
 
        // Output
        for (String s : uniqueNames)
            System.out.println(s);
        
        
       /* persons.stream()
        .filter(p->p.getSex()==Person.Sex.FEMALE)
        .map(p->p.getName())
        .distinct().sorted((o1,o2)-> o1.compareTo(o2))
		.collect(Collectors.toList())
		.forEach(System.out::println);*/
       
        System.out.println("--- Start - Java 8 Way ----");
        persons.stream()
        .filter(p->p.getSex()==Person.Sex.FEMALE)
        .map(p->p.getName())
        .distinct().sorted((aName, bName) -> aName.length() - bName.length())
        .forEach(System.out::println);
        System.out.println("--- End - Java 8 Way ----");
        
      
    }
 
    public static void main(String[] args){
        Person dan = new Person("Dan", Sex.MALE, 31, "daniel.schlegel@oswego.edu");
        Person phil = new Person("Phil", Sex.MALE, 22, "phil@philsdomain.org");
        Person julie = new Person("Julie", Sex.FEMALE, 35, "julue@google.com");
        Person julie2 = new Person("Julie", Sex.FEMALE, 19, "juliethesecond@facebook.com");
        Person alexis = new Person("Alexis", Sex.FEMALE, 44, "alexis@alexis.jp");
        Person evie = new Person("Evie", Sex.FEMALE, 25, "evie1997@yahoo.com");
 
        List<Person> persons = new ArrayList<>();
        persons.add(dan);
        persons.add(phil);
        persons.add(julie);
        persons.add(julie2);
        persons.add(alexis);
        persons.add(evie);
 
        System.out.println("--- Male Names ---");
        printMaleNames(persons);
 
        System.out.println("--- Unique, Sorted by Length, Female Names ---");
        printUniqueFemaleNamesByLength(persons);
    }
}
