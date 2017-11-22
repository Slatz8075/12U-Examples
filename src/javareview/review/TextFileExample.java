/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author slatz8075
 */
public class TextFileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a blank file
        FileReader file = null;
        try{
            //fix this proper loading later
            URL url = TextFileExample.class.getResource("input.txt");
            System.out.println(url);
            // creating the file reader
            file = new FileReader(url.getFile());
        }catch(Exception e){
            //handle any errors
            //print out the lovely red errors
            e.printStackTrace();
            //exit the program
            System.exit(0);
        }
        //use a Scanner with the file
        Scanner in = new Scanner(file);
        //get the number of Addresses
        int numAddresses = in.nextInt();
        
        //move to the next line
        in.nextLine();
        //create an empty roladex
        Contact[] contacts = new Contact[numAddresses];
        //go through the file
        for(int i = 0; i < numAddresses; i++){
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine().trim();
            //create the contact
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNumber(phone);
            //add contact to list
            contacts[i] = c;
        }
        
        //print out the rolodex
        for(int i = 0; i < contacts.length; i++){
            System.out.println(contacts[i]);
        }
    }
}
