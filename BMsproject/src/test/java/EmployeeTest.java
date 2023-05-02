/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author margaret
 */
public class EmployeeTest {
    Employee employeef;
     Employee employeep;
    public EmployeeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         employeef = new Employee(1, "Aby", "Loy", "aby@abc.com", "5643278690", EmployeeType.FullTime);
    employeep = new Employee(2, "Amy", "Greta","amy@abc.com","3452135463", EmployeeType.PartTime);
    }

    
    @AfterMethod
    public void tearDownMethod() throws Exception {
    }


    @Test
    public void testEid1(){
     assertEquals(employeef.getEid(),1) ;  
    }
     @Test
    public void testFirst1(){
     assertEquals(employeef.getFirst(),"Aby") ;  
    }
     @Test
    public void testLast1(){
     assertEquals(employeef.getLast(),"Loy") ;  
    }
    
    @Test
    public void testEmail1(){
     assertEquals(employeef.getEmail(),"aby@abc.com") ;  
    }
    
    @Test
    public void testPhone1(){
     assertEquals(employeef.getPhone(),"5643278690") ;  
    }
    
     @Test
    public void testEmployeeType1(){
     assertEquals(employeef.getEmpType(),EmployeeType.FullTime) ;  
    }
    
    @Test
    public void testEid2(){
     assertEquals(employeep.getEid(),2) ;  
    }
     @Test
    public void testFirst2(){
     assertEquals(employeep.getFirst(),"Amy") ;  
    }
     @Test
    public void testLast2(){
     assertEquals(employeep.getLast(),"Greta") ;  
    }
    
    @Test
    public void testEmail2(){
     assertEquals(employeep.getEmail(),"amy@abc.com") ;  
    }
    
    @Test
    public void testPhone2(){
     assertEquals(employeep.getPhone(),"3452135463") ;  
    }
    
     @Test
    public void testEmployeeType2(){
     assertEquals(employeep.getEmpType(),EmployeeType.PartTime) ;  
    }
     @Test
    public void testToStringf(){
           assertEquals(employeef.toString(),"Employee{eid=1, first=Aby, last=Loy, email=aby@abc.com, phone=5643278690, empType=FullTime}");  
  
    }
    @Test
    public void testToStringp(){
           assertEquals(employeep.toString(),"Employee{eid=2, first=Amy, last=Greta, email=amy@abc.com, phone=3452135463, empType=PartTime}");
    }
    
    
}
