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
        Dog dog2 = new Dog("Imaginary dog", 5, "Weiner");
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

        for(int i = 0; i < people.length; i++){
            System.out.println("Hello, my name is " + people[i].name + ". I'm " + people[i].age + " years old.");
            if(people[i].name.equals("Tam")){
                System.out.println("I own a " + car1.getMake() + " " + car1.getModel() + "! I also have a dog named " + dogs[0].getName() + "!");
            }
            else{
                System.out.println("I own a dog named " + dogs[1].getName() + ".");
            }
        }

    }
}
