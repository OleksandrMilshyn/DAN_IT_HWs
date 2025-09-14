package aqa_hw_11;

import java.util.Base64;

import static io.restassured.RestAssured.given;

public class TestRailController {

    private static final String RUN_ID = "1";
    private static final String BASE_API_URL = "https://scool123.testrail.io/index.php?/api/v2/";
    private static final String USER_EMAIL = "milshyn.ca@gmail.com";
    private static final String USER_PASSWORD = "gV4gm.^XS4zEV*L";
    private static final String CREDENTIALS = Base64.getEncoder().encodeToString((USER_EMAIL + ":" + USER_PASSWORD).getBytes());

    public static void publishResults(int statusID, int testCaseId) {
        given().header("Authorization", "Basic " + CREDENTIALS)
                .contentType("Application/json")
                .body(new TestRailRequestDto(statusID))
                .post(BASE_API_URL + String.format("add_result_for_case/%s/%s", RUN_ID, testCaseId));

    }
}
