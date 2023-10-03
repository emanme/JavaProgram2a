 
package program2a;

/**
 *
 * @author Rose
 */
public class Program2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataProvider.generateData();
        
        for (Student student:DataProvider.students){
            System.out.println(student.getFullName());
 
        }
    }
    
}
