package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("Tam", 24);
        logger.info("New Person created. Height is " + person1.getHeight());
        Person person2 = new Person("Maria", 34);
        Person person3 = new Person("Alex", 45);
        Person person4 = new Person("Barbara", 56);
        Person person5 = new Person("Cole", 62);

        Chair chair1 = new Chair("Wood", "Brown", 4, 80);
        Dog dog1 = new Dog("Dasi", 8, "Chihuahua");
        Dog dog2 = new Dog("Imaginary dog", 5, "Weiner dog");
        Car car1 = new Car("Honda", "Accord", 2013, 96000, 12);

        Person[] people = new Person[5];
        Dog[] dogs = new Dog[2];

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;

        dogs[0] = dog1;
        dogs[1] = dog2;

        for(Person person : people){
            System.out.println("Hello, my name is " + person.name + ". I'm " + person.age + " years old.");
            if(person.name.equals("Tam")){
                System.out.println("I own a " + car1.getMake() + " " + car1.getModel() + "!");
                System.out.println("I also have a chair that's made of " + chair1.getMaterial().toLowerCase() + " and the color is " + chair1.getColor().toLowerCase() +".");

            }
        }

        // testing enhanced for after seeing intellij's suggestion
        System.out.println("******************************");
        for(Dog dog : dogs){
            System.out.println("Woof woof. My name is " + dog.getName() + ". I am a " + dog.getBreed().toLowerCase());
        }
    }
}
