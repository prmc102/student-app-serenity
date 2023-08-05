package com.studentapp.studentinfo;

import com.studentapp.constants.EndPoints;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Title;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Jay
 */
//@RunWith(SerenityRunner.class)
public class FirstSerenityTest extends TestBase {

    @Test
    public void getAllStudents() {
        Response response = SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_STUDENT);
        response.then().statusCode(200);
        response.then().log().all();
    }

    @Test
    public void thisIsFailingTest() {
        Response response = SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_STUDENT);
        response.then().statusCode(201);
        response.then().log().all();
    }

    @Ignore
    @Test
    public void thisIsASkipped(){

    }

    @Manual
    @Test
    public void thisIsManualTest(){

    }

    @Test
    public void thisIsATestWithError(){
        System.out.println("This is an Error " + 5/0);
    }

    @Test
    public void thisIsCompromised() throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }

    @Title("This test will get the information of all students")
    @Test
    public void test001() {
        Response response = SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_STUDENT);
        response.then().statusCode(200);
        response.then().log().all();
    }

}
