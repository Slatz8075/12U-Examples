/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Human {

    //define instance variables
    private String name;
    private int age;
    private char gender;

    //constructor:
    //used to create individual humans
    //"setup" a human to use
    public Human(String name, int age,char gender) {
        this.name = name;
        this.age = age;
        this.gender = 'm';
    }

    public String getName() {
        return name;
    }
    
    //accessors
    public int getAge() {
        return age;
    }
    
    //mutator
    public void setName(String name){
        this.name = name;
    }

    public void celebrateBirthday(){
        //increase human age
        age++;
        //wish them a happy birthday
        System.out.println("Happy birthday " + this.name);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human bob = new Human("Bob", 20, 'M');
        System.out.println(bob.getName());
        System.out.println(bob.getAge());

        Human alice = new Human("Alice", 51, 'F');
        System.out.println(alice.getName());
        System.out.println(alice.getAge());
        
        alice.celebrateBirthday();
        System.out.println(alice.getAge());
        System.out.println(bob.getAge());
    }
}
