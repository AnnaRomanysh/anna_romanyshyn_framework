package apitest;
import org.json.JSONObject;

import static constants.api.ReqResRequestConnst.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ReqResTestBase extends  BaseTest{
   private JSONObject requestParams;

    public void verifyUserDataPresenceOnPage(int pageNumber) {
info("Verify user data is present on page №: "+pageNumber);
        given().
                param(PAGE, pageNumber).
                when().
                get(USERS_URL).
                then().
                statusCode(200);

    }
    public void verifyUsersAmountOnPage(int pageNumber, int usersAmount) {
        info("Verify: on page №: "+pageNumber+" are "+usersAmount+" users");
        given().
                when().
                param(PAGE, pageNumber).
                get(USERS_URL).
                then().
                statusCode(200).
                body(DATA, hasSize(3));
    }
    public void verifyUserPresenceById(int userId) {
        info("Verify user with id: "+ userId + "exists");
        given().
                when().
                get(USERS_URL+userId).
                then().
                statusCode(200);
    }
    public void verifyUserNamesById(int userId, String firstName, String lastName) {
        info("Verify user with id: "+ userId + "has firstName - "+firstName+ " and lastName "+lastName);
        given().
                when().
                get(USERS_URL+userId).
                then().
                statusCode(200).
                body(DATA+"."+FIRST_NAME, equalTo(firstName),
                        DATA+"."+LAST_NAME, equalTo(lastName));
    }
    public void verifyUserAbsenceById(int userId) {
        info("Verify user with id: "+ userId + " does not exists");
        given().
                when().
                get(USERS_URL+userId).
                then().
                statusCode(404);
    }
    public void verifyResourceDataById(int resourceId, String resourceName,int resourceYear, String resourceColor) {
        info(String.format("Verify resource with id: %d has name - %s, year - %d and color - %s",resourceId, resourceName, resourceYear,  resourceColor));
        given().
                when().
                get(UNKNOWN_RESOURCE_URL+resourceId).
                then().
                statusCode(200).
                body(DATA+"."+NAME, equalTo(resourceName), DATA+"."+YEAR, equalTo(resourceYear),DATA+"."+COLOR, equalTo(resourceColor));
    }

    public void verifyUserCreation(String userName, String userJob) {
        info("Verify user creation with name: "+ userName + " and job"+ userJob);
        requestParams = new JSONObject();
        requestParams.put(NAME, userName).put(JOB, userJob);
        given().
               headers("Content-Type", "application/json").
                body(requestParams.toString()).
                when().
                post(USERS_URL).
                then().
                statusCode(201).
                body(NAME, equalTo(userName), JOB, equalTo(userJob));
    }

    public void verifyUserUpdate(String userName, String userJob) {
        info("Verify user update with name: "+ userName + " and job"+ userJob);
        requestParams = new JSONObject();
        requestParams.put(NAME, userName).put(JOB, userJob);
        given().
                headers("Content-Type", "application/json").
                body(requestParams.toString()).
                when().
                put(USERS_URL).
                then().
                statusCode(200).
                body(NAME, equalTo(userName), JOB, equalTo(userJob), APDATED_AT, anything());
    }
    public void verifyUserDeleteById(int userID) {
        info("Verify user delete by id: "+ userID);
        given().
                when().
                delete(USERS_URL+userID).
                then().
                statusCode(204);
    }
    public void verifyUnsuccessfulLogin(String password) {
        requestParams = new JSONObject();
        requestParams.put(PASSWORD, password);
        info("Verify unsuccessful login by sending only  password parameter: "+ password);
        given().
                body(requestParams.toString()).
                when().
                post(LOGIN_URL).
                then().
                statusCode(400).
                body(ERROR, equalTo("Missing email or username"));
    }



}
