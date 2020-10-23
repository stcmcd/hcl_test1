import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import steve.BikesExtension;
import steve.step_definitions.RestAss.pojo.Bikes;
import steve.step_definitions.RestAss.pojo.Locations;
import java.util.*;

/// this is  aa comment again, again


public class hclStepDefs {


    @Then("^print the area of a triangle with (\\d+) and height (\\d+)$")
    public static void printAreaOfTriangle(String city, String country) throws Throwable {
    }

    @Then("^does the Founder and Chairman exist$")
    public static void founderAndChairman(String basePath, DataTable dataTable) throws Throwable {
    }

    @Then("^Screenshote$")
    public static void screenshots(String basePath, DataTable dataTable) throws Throwable {
    }

}
