/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 100456D
 */
public class StudentManagementSystemTest {

    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of listAllStudents method, of class StudentManagementSystem.
     */
    @Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
        StudentManagementSystem instance = null;
        instance.listAllStudents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student stu = null;
        StudentManagementSystem instance = null;
        instance.registerStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}