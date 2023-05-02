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
public class UserloginTest {
    Userlogin userlogin;
    public UserloginTest() {
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
        userlogin = new Userlogin("Kevin1Patel", "KP123", "Kevin", "Patel", true);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
   @Test
   public void testUsername(){
   assertEquals(userlogin.getUsername(),"Kevin1Patel");   
   }
    @Test
   public void testPassword(){
   assertEquals(userlogin.getPassword(),"KP123");   
   }
   @Test
   public void testFirstName(){
   assertEquals(userlogin.getFirstName(),"Kevin");   
   }
@Test
   public void testLasttName(){
   assertEquals(userlogin.getLastName(),"Patel");   
   }
   
   @Test
   public void testIsEmployee(){
   assertEquals(userlogin.isIsEmployee(),true);   
   }
   
   
}
