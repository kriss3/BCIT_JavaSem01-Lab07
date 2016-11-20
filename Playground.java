/**
 *  Class to represent a playground
 *
 *  Lab 6 solution
 *
 *  @author Gary Tong
 */
public class Playground
{
    // instance variable for a Person reference
    private Person p1;
    private Person p2;
    

    public void run()
    {
        // create a new instance of the Person class
        // the default ctor will set the default fields
        p1 = new Person();    // Gary Tong 30 185
        p2 = new Person();
        

        // print default fields
        System.out.println("Initial setup");
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());        
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());
        System.out.println();
        
        // mutate the fields for P1
        p1.setFirstName("John");
        p1.setLastName("Doe");
        p1.setAge(50);
        p1.setHeight(170.5);
        
        //mutate the fields for P2
        p2.setFirstName("Maria");
        p2.setLastName("Curie-Sklodowska");
        p2.setAge(71);
        p2.setHeight(165.5);

        // print newly mutated fields P1
        System.out.println("First persion object mutated: ");
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());
        System.out.println();
        
        //print newly muated fields for P2
        System.out.println("Second person object mutated: ");
        System.out.println(p2.getFirstName());
        System.out.println(p2.getLastName());
        System.out.println(p2.getAge());
        System.out.println(p2.getHeight());
        System.out.println();
        
        System.out.println("What about their first names?");
        if(p1.getFirstName().equals(p2.getFirstName()))
        {
            System.out.println("Same names !");
        }
        else
        {
            System.out.println("Different names !");
        }
        
    }
}