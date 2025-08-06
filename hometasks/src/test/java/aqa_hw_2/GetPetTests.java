package aqa_hw_2;

import aqa_hw_2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetPetTests {

    @Test
    public void verifyPetCanBeObtained() {
        int entityIdToFind = 1234567776;
        Response response = given().get("https://petstore.swagger.io/v2/pet/" + entityIdToFind);
        System.out.println(response.asPrettyString());

        PetDto petDto = response.as(PetDto.class);
        System.out.println(petDto);

        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(entityIdToFind, petDto.getId());
    }
}
