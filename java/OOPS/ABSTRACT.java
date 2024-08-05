public class ABSTRACT {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(c.color);
    }
}
// abstract class
abstract class Animal{
    String color;

    Animal(){
        color="brown";

    }
    void eat(){
      System.out.println("ANIMAL EATS");
    }

    // abstract function here animal class has given only idea that all the sub classes has to include walk in its class
    abstract void walk();
}

// sub class

class Horse extends Animal{

    void changeColor(){
        color="Dark Brown";
    }
    void walk(){
     System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color="Yellow";
    }
    void walk(){
     System.out.println("walks on 2 legs");
    }
}
