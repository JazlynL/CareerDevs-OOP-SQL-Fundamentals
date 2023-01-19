package Inheritance;

public class InheritanceTwoHackerrank {
    //Write your code here

    //A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
    class Arithmetic{

        public int add(int add1, int add2){

            return add1+add2;

        }
    }
    //A class named Adder that inherits from a superclass named Arithmetic.
    class Adder extends Arithmetic{

        Adder(){
            super();
        }

    }
}
