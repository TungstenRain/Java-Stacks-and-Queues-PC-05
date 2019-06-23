package ch21pc05;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author frank
 */
public class Ch21pc05 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Instantiate ArrayList<Person> class
        ArrayList<Person> persons = new ArrayList<Person>();
        
        System.out.println("Welcome to the Tracing Genealogies program.");
        
        Scanner scanner = null;
        Scanner keyboard = new Scanner(System.in);
        try {
            scanner = new Scanner(new File("data.txt"));
            String N = (String) scanner.next();
            while (scanner.hasNext()) {
                String name = scanner.next();
                Person person = new Person(name);
                int childCount = Integer.parseInt(scanner.next());
                System.out.print(name + " " + childCount);
                for (int i = 1; i <= childCount; i++) {
                    String cName = scanner.next();
                    System.out.print(" " + cName);
                    person.addChild(cName);
                }
                persons.add(person);
                System.out.println();
            }
            
            System.out.println("Enter name to check relation:");
            String x = keyboard.next();
            String y = keyboard.next();
            for(Person p : persons) {
                for(String c : p.getChildrens()) {
                    if(c.equalsIgnoreCase(y)) {
                        String d = p.getName();
                        if(d.equals(x)) {
                            System.out.println(y + " is a descendent of "+ d);
                            System.exit(0);
                        }
                    }
                }
            }
            System.out.println(y + " is not a descendent of "+ x);
        } catch (Exception e) {
            // To do
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
