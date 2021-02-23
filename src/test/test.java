
package test;
import  main.Contacts;
import main.Order;
import main.Student;
public class test {


    public static void main(String[] args) {
      Contacts contacts = new Contacts(" "," "," ");
        System.out.println(contacts);
        
        Order order = new Order(1, " ", " ");
        System.out.println(order);
        Student stufent = new Student(1, " ", " ", " ");
        System.out.println(stufent);
    }
    
}