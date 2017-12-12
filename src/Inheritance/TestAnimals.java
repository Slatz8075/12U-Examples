/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author slatz8075
 */
public class TestAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog fido = new Dog("Fido", 3, "Boston Terrier", "black and white");
        Cat whiskers = new Cat("Whiskers", 9, "Tabi", "black");
        Dog spike = new Dog("spike", 8, "Bull Dog", "brown");

        fido.speak();
        whiskers.speak();

        System.out.println(fido);

        fido.howl();

        Pet[] p = new Pet[3];
        p[0] = fido;
        p[1] = whiskers;
        p[2] = spike;

        for (int i = 0; i < 3; i++) {
            System.out.println(p[i]);
            if (p[i] instanceof Dog) {
                Dog tempDog = (Dog)p[i];
                tempDog.howl();
            } else {
                p[i].speak();
            }
        }
    }
}
