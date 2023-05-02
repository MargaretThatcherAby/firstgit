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
public class PartTimeTest {
     PartTime parttime;
    public PartTimeTest() {
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
        parttime = new PartTime(40.0f, 20.0f, 12, "Rina", "Patel", "rina@gmail.com", "8476664455", EmployeeType.PartTime);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
        
    @Test
    public void testHours (){
        assertEquals(parttime.getHours(), 40.0f);
    }
    
    @Test
    public void testRate (){
        assertEquals(parttime.getRate(), 20.0f);
    }
    
    @Test
    public void testEid() {
        assertEquals(parttime.getEid(), 12);
    }
    
    
    @Test
    public void testFirst () {
        assertEquals(parttime.getFirst(), "Rina");
    }
    
    @Test
    public void testLast () {
        assertEquals(parttime.getLast(), "Patel");
    }
    
    @Test
    public void testemail () {
        assertEquals(parttime.getEmail(), "rina@gmail.com");
    }
    
    @Test
    public void testphone () {
        assertEquals(parttime.getPhone(), "8476664455");
    }
    
    @Test
    public void testEmployeeType (){
        assertEquals(parttime.getEmpType(),EmployeeType.PartTime);
    }
   @Test
    public void testToString(){
        assertEquals(parttime.toString(), "PartTime{hours=40.0, rate=20.0}Employee{eid=12, first=Rina, last=Patel, email=rina@gmail.com, phone=8476664455, empType=PartTime}");
    }
}