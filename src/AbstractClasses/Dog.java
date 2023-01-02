package AbstractClasses;
// you cant use a abstract class like a regular class
// you are not able to instantiate objects
//abstract methods is a method that isnt implemeneted yet.
abstract class Dog {
    String breed;

    public void bark(){
        System.out.println("BARK BARKKKK");
    }
// we arent going to be putting the code in the curly braces.
    // it has the method but it doesn't know what's going to be implemented
    public abstract void poop();

}
class Poodle extends Dog{
public void poop(){
    System.out.println("He did a big one");
}
}
class Weiner extends Dog{
    public void poop(){
        System.out.println("Not That big");
    }

}
//interface example
// interface assumes all methods are going to be abstract- which means unimplemented list.
interface DogInterface{
    void bark();
    void poop();

}
// instead of using the extend keyword we will use the implement keyword because we will be implementing methods
class Yorkie implements DogInterface{

    public void bark() {
        System.out.println("Yah Yah Yah");
    }


    public void poop() {
        System.out.println("Poopie");
    }
}
