package Homeworks.Homework5;

public class Pet {
    private String breed;
    private String sex;
    private byte age;
    private String color;
    private float weight;
    private String name;
    private byte legs;
    private float height;
    private boolean fur;

    //properties


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(!breed.isEmpty()){
            this.breed = breed;
        }else {
            System.out.println("Error: Invalid entry for breed!");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(!sex.isEmpty()){
            this.sex = sex;
        }else {
            System.out.println("Error: Invalid entry for sex!");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age >= 0){
            this.age = age;
        }else {
            System.out.println("Error: Invalid entry for age!");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(!color.isEmpty()){
            this.color = color;
        }else {
            System.out.println("Error: Invalid entry for color!");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight >= 0.05f){
            this.weight = weight;
        }else {
            System.out.println("Error: Invalid entry for weight!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid entry for name!");
        }    }

    public byte getLegs() {
        return legs;
    }

    public void setLegs(byte legs) {
        if(legs >= 1){
            this.legs = legs;
        }else {
            System.out.println("Error: Invalid entry for legs!");
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if(height >= 3){
            this.height = height;
        }else {
            System.out.println("Error: Invalid entry for height!");
        }
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    //constructors
    public Pet(String breed, String sex, byte age, String color, float weight, String name, byte legs, float height, boolean fur){
        setBreed(breed);
        setSex(sex);
        setAge(age);
        setColor(color);
        setWeight(weight);
        setName(name);
        setLegs(legs);
        setHeight(height);
        setFur(fur);
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