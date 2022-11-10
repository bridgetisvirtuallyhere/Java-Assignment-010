public class Dog { //Your class should be named **Dog**
    //You should have **private** instance variables/fields for all the data members
    private String breed;
    private String size;
    private String colour;
    private String name;
    private int age;


    public Dog(String breed, String size, String colour, String name, int age) {
        //You should have a **constructor** that sets the initial state of the data members via passed parameters
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.name = name;
        this.age = age;
    }

    //You should have 4 instance methods for eat, run, sleep, and name
    public String eat(){
        System.out.print("Thanks... You got food everywhere, ");
        return name;
    }

    //Make at least 2 of your methods functional
    public int run(){
        return DogPark.lapsRan();
    }

    public String sleep(){
        System.out.print("Aww...sleepy doggo...shhh....Their coat is the most beautiful shade of ");
        return colour;
    }

    public String name(){
        return name;
    }

    //You should have a **main** method that creates the 3 Dog objects in the diagram
    public static void main(String[] args) {
        Dog dog1Object = new Dog("Bulldog","large","light gray","Fluffy", 5);
        Dog dog2Object = new Dog("Beagle","large","orange", "Big-Dawg",6);
        Dog dog3Object = new Dog("German Shepherd","large","white & orange", "Kat",6);
        System.out.println("My dog's name is " +dog3Object.name() + ", Muahahaha");
        System.out.println("Where's " + dog2Object.name() + "?");
        System.out.println(dog2Object.sleep());
        System.out.println("Wow! " + dog1Object.name() +" ran " + dog1Object.run() + " whole laps today at the dog park!");
        System.out.println(dog1Object.eat());
    }
}
