package MOOCFI2.Part9.Inheritance.PersonAndSubclasses;

public class Main {
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits " + ollie.credits());

        Student allie = new Student("Allie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(allie);
        allie.study();
        System.out.println(allie);
    }
}