package aqa_hw_2;

import aqa_hw_2.dto.CategoryDto;
import aqa_hw_2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreatePetTests {

    @Test
    public void verifyPetCanBeCreated(){

        int petIdToCreate = 793793793;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("Dog");
        String petNameToCreate = "Baron";
        String status = "available";

        PetDto petDtoToCreate = new PetDto(petIdToCreate, categoryDto, petNameToCreate, status);

        Response createPetResponse = given()
                .contentType("application/json")
                .body(petDtoToCreate)
                .post("https://petstore.swagger.io/v2/pet");
        PetDto postResponseDto = createPetResponse.as(PetDto.class);
        Assert.assertEquals(petIdToCreate, postResponseDto.getId());

        Response previouslyCreatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatedPetResponse.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, previouslyCreatedPetDto.getId());
        Assert.assertEquals(categoryDto.getName(), previouslyCreatedPetDto.getCategory().getName());
        Assert.assertEquals(petNameToCreate, previouslyCreatedPetDto.getName());
        Assert.assertEquals(status, previouslyCreatedPetDto.getStatus());
    }
}
