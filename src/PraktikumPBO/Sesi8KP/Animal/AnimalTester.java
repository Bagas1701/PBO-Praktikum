package PraktikumPBO.Sesi8KP.Animal;
//Supaerclass
class Animal {
    //Properti
    String name;

    //Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Metode
    public void speak() {
        System.out.println("Animal speaks");
    }
}

// Subclass
class Dog extends Animal {
    //Constructor
    public Dog(String name) {
        super(name); // Memanggil constructor dari superclass
    }

    //Override metode speak
    @Override
    public void speak() {
        System.out.println(name + "Says woof");
    }
}

public class AnimalTester {
    public static void main(String[] args) {
        //membuat objek dari superclass Dog
        Dog dog = new Dog("Buddy ");
        dog.speak(); // Outputnya: Buddy say woof
    }
}
