package javareview.review;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class ArrayStack {

    //store all of the integers on the stack
    private int[] stack;
    //keep track of how many items
    private int numItems;

    public ArrayStack() {
        stack = new int[10];
        numItems = 0;
    }

    public void push(int item) {
        //is there room in the stack
        if (numItems < stack.length) {
            //put the item on the stack
            stack[numItems] = item;
            numItems++;
        }else{
            //make more room
            int[] temp = new int[stack.length*2];
            //copy items over
            for(int i = 0; i <stack.length; i++){
                temp[i] = stack[i];
            }
            //stack becomes new array
            stack = temp;
            //add item
            stack[numItems] = item;
            numItems++;
        }
    }

    public int pop(){
        //get the top item on the stack
        int item = stack[numItems - 1];
        //one less item
        numItems--;
        //give back item
        return item;
    }
    
    public int size(){
        return numItems;
    }
    
    public int peek(){
        return stack[numItems - 1];
    }
    
    public boolean isEmpty(){
        return numItems == 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an empty stack
        ArrayStack stack = new ArrayStack();
        System.out.println("Empty: " + stack.isEmpty());
        stack.push(12);
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("peek: " + stack.peek());
        System.out.println("size: " + stack.size());
        int item = stack.pop();
        System.out.println("poped Item: " + item);
        System.out.println("Empty: " + stack.isEmpty());
        
        //test adding lost of items
        for(int i = 0; i < 100; i++){
            stack.push(i);
        }
        System.out.println("size: " + stack.size());
        System.out.println("peek: " + stack.peek());
        stack.pop();
        System.out.println("peek: " + stack.peek());
        
    }
}
