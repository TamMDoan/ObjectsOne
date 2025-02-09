package object1;

public class Person {
    String name;
    int age = 0;
    private int height; //in centimeters

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 180;
    }

    public int getHeight(){
        return this.height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

/*
Class is the template for a set of objects.
Objects are an instance of the class.
 */
