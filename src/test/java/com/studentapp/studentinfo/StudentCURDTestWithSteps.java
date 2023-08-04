/*
package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import com.studentapp.utils.TestUtils;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentCURDTestWithSteps extends TestBase {
    static String firstName = "PrimUser" + TestUtils.getRandomValue();
    static String lastName = "PrimeUser" + TestUtils.getRandomValue();
    static String programme = "Api Testing";
    static String email = TestUtils.getRandomValue() + "xyz@gmail.com";
    static int studentId;

    @Steps
    StudentSteps studentSteps;

    @Title("This will create a new student")
    @Test
    public void test001() {
        List<String> courseList = new ArrayList<>();
        courseList.add("Java");
        courseList.add("Rest Assured");

    }

    @Title("Verify if the student was added to the application")
    @Test
    public void test002(){

    }

    @Title("Update the user information and verify the updated information")
    @Test
    public void test003(){
        firstName = firstName + "_updated";
        List<String> courseList = new ArrayList<>();
        courseList.add("Java");
        courseList.add("Rest Assured");

    }

    @Title("Delete the student and verify if the student is deleted!")
    @Test
    public void test004(){

    }
}
*/
