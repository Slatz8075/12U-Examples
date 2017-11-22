/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

/**
 *
 * @author slatz8075
 */
public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    
    //constructor using the name
    public Contact(String name){
        this.name = name;
    }
    
    public void setNumber(String number){
        this.phoneNumber = number;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    @Override
    public String toString(){
        String format = this.name + "\n";
        format += "Phone: " + this.phoneNumber + "\n";
        format += "Email: " + this.email + "\n";
        
        return format;
    }
}
