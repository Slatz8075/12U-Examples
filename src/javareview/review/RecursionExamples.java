/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

/**
 *
 * @author slatz8075
 */
public class RecursionExamples {

    //returns the nth fibbonacci number using a loop
    //n - the nth number we want in the sequence
    public int fibLoop(int n) {
        //array to store sequence
        int[] numbers = new int[n + 1];
        numbers[0] = 1;
        //boundry condition fix
        if (n > 0) {
            numbers[1] = 1;
        }
        //building the sequence
        for (int i = 2; i < n + 1; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        //returning the number
        return numbers[n];
    }
    
    //calculate the nth fib number using recursion
    //n - the nth number we want in the sequence
    public int fibR(int n){
        //BASE CASE
        if(n == 0 || n == 1){
            return 1;
        }else{
            return fibR(n-1) + fibR(n-2);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RecursionExamples test = new RecursionExamples();
        int bound1 = test.fibLoop(0);
        System.out.println("oth: " + bound1);
        int bound2 = test.fibLoop(1);
        System.out.println("1st: " + bound2);
        int norm = test.fibLoop(26);
        System.out.println("26th: " + norm);
        System.out.println("--------------------");
        int boundR1 = test.fibR(1);
        System.out.println("oth: " + boundR1);
        int boundR2 = test.fibR(1);
        System.out.println("1st: " + boundR2);
        int normR = test.fibR(6);
        System.out.println("6th: " + normR);
    }
}