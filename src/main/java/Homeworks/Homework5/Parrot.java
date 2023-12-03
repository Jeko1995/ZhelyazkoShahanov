package Homeworks.Homework5;

public class Parrot extends Pet{
    //instance variable
    private boolean hasTail; //specific characteristics for the Parrot

    //properties


    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    //constructors
    public Parrot(String breed, String sex, byte age, String color, float weight,
                  String name, byte legs, float height, boolean fur, boolean hasTail){
        super(breed, sex, age, color, weight, name, legs, height, fur);//calling constructor of the super (or parent) class
        setHasTail(hasTail);
    }


    //methods i.e. actions
    @Override
    public void makeSomeNoise() {
        System.out.printf("%s is talking...\n", getName());
    }

    public void printData(){
        System.out.printf("%s is %d years old, has %f height and weights %f kg. It is from %s sex, the color is %s" +
                ", the breed is %s. It has %d legs and", getName(), getAge(), getHeight(), getWeight(), getSex(), getColor(), getBreed(), getLegs());
        if (isFur()) {
            System.out.println(" has big feathers.");
        } else {
            System.out.println(" does not have big feathers.");
        }
        if (hasTail){
            System.out.println("It has tail.");
        }else {
            System.out.println("It does not have tail.");
        }
    }
}