package com.library.steps;

import com.library.utility.DB_Util;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class UserInfoStepDefs {

    String actualUserCount;
    @Given("Establish the database connection")
    public void establish_the_database_connection() {

      //  DB_Util.createConnection();

    }
    @When("Execute query to get all IDs from users")
    public void execute_query_to_get_all_i_ds_from_users() {

        DB_Util.runQuery("select count(id) from users");

        actualUserCount= DB_Util.getFirstRowFirstColumn();

    }
    @Then("verify all users has unique ID")
    public void verify_all_users_has_unique_id() {

        DB_Util.runQuery("select count(distinct id) from users");
        String expectedlUserCount= DB_Util.getFirstRowFirstColumn();

        Assert.assertEquals(expectedlUserCount,actualUserCount);


     //   DB_Util.destroy();
    }
}
