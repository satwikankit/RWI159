
class Animal {
    
    void eat() {
        System.out.println("The animal is eating.");
    }

    
    void sleep() {
        System.out.println("The animal is sleeping.");
    }
}


class Dog extends Animal {
    
    void bark() {
        System.out.println("The dog is barking.");
    }
}


public class SingleLevelInheritance {
   
    public static void main(String[] args) {
        
        Dog dog = new Dog();

        
        dog.eat();

      
        dog.sleep();

       
        dog.bark();	
    }
}