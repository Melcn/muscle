package WOtraining;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}
