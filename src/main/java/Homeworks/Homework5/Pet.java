package Homeworks.Homework5;

public class Pet {
    public String breed;
    public String sex;
    public byte age;
    public String color;
    public float weight;
    public String name;
    public byte legs;
    public float height;
    public boolean fur;

    //constructors
    public Pet(String breed, String sex, byte age, String color, float weight, String name, byte legs, float height, boolean fur){
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.legs = legs;
        this.height = height;
        this.fur = fur;
    }

    //default constructor
    //public Pet(){



    //methods i.e. actions
    public void eat(){
        System.out.printf("%s is eating...\n", name);
    }

    public void makeSomeNoise(){
        System.out.printf("%s is making noise\n", name);
    }
    public void sleep(){
        System.out.printf("%s is sleeping...\n", name);
    }
    public void playing(){
        System.out.printf("%s is playing...\n", name);
    }

    public void printData() {
        System.out.printf("%s is %d years old, has %f height and weights %f kg. It is from %s sex, the color is %s" +
                ", the breed is %s. It has %d legs and", name, age, height, weight, sex, color, breed, legs);
        if (fur) {
            System.out.println(" has long fur.");
        } else {
            System.out.println(" does not have long fur.");
        }
    }
}