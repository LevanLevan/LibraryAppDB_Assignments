package com.library.steps;

import com.library.utility.DB_Util;
<<<<<<< HEAD
import io.cucumber.java.en.*;
import org.junit.Assert;


=======
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

>>>>>>> origin/main
public class UserInfoStepDefs {

    String actualUserCount;
    @Given("Establish the database connection")
    public void establish_the_database_connection() {

<<<<<<< HEAD
      //  DB_Util.createConnection();
=======
        // Make conn with database
        // DB_Util.createConnection();
        System.out.println("**********************************************");
        System.out.println("*** CONNECTION WILL BE DONE WITH HOOK CLASS***");
        System.out.println("**********************************************");
>>>>>>> origin/main

    }
    @When("Execute query to get all IDs from users")
    public void execute_query_to_get_all_i_ds_from_users() {
<<<<<<< HEAD

        DB_Util.runQuery("select count(id) from users");

        actualUserCount= DB_Util.getFirstRowFirstColumn();
=======
        String query="select count(id) from users"; // 1855
        DB_Util.runQuery(query);

        actualUserCount = DB_Util.getFirstRowFirstColumn();
        System.out.println("actualUserCount = " + actualUserCount);
>>>>>>> origin/main

    }
    @Then("verify all users has unique ID")
    public void verify_all_users_has_unique_id() {

<<<<<<< HEAD
        DB_Util.runQuery("select count(distinct id) from users");
        String expectedlUserCount= DB_Util.getFirstRowFirstColumn();

        Assert.assertEquals(expectedlUserCount,actualUserCount);


     //   DB_Util.destroy();
=======
        String query="select count(distinct id) from users";
        DB_Util.runQuery(query);
        String expectedUserCount = DB_Util.getFirstRowFirstColumn();
        System.out.println("expectedUserCount = " + expectedUserCount);

        // MAKE ASSERTIONS
        Assert.assertEquals(expectedUserCount,actualUserCount);

        //CLOSE CONN
        // DB_Util.destroy();
        System.out.println("**********************************************");
        System.out.println("*** DESTROY  WILL BE DONE WITH HOOK CLASS***");
        System.out.println("**********************************************");


>>>>>>> origin/main
    }
}
