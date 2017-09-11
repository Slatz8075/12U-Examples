/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

/**
 *
 * @author slatz8075
 */
public class JavaMethods {
    
    public void helloWorld(){
        System.out.println("Hello World");
    }
    
    public void helloWorld(String name){
        System.out.println("Hello " + name);
    }
    
    public int sumRange(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
        sum = sum + i;
    }
        return sum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an object to run methods
        JavaMethods test = new JavaMethods();
        test.helloWorld();
        test.helloWorld("Steve");
    }
}