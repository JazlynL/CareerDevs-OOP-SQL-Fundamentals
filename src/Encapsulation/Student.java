package Encapsulation;

public class Student {
    private String name;
    int age;

//also if you don't have to use the --this keyword when the data is named differently.
// using a get method and set method to allow us to hide data, its data hiding the most important factor.
    public void setName(String newName){
       name = newName;
    }
    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
