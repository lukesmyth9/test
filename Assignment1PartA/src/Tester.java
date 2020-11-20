import org.junit.*;
public class Tester {

    /**
     * @param args the command line arguments
     */
    @Test
    public void Test(){
    	 
    	Student student = new Student("Luke", 21, "2002-01-01", 173);
         
         //System.out.println("Username= " + student.getUsername());
         
         Assert.assertEquals("Luke21", student.getUsername());
        
         
    }
    
   
}