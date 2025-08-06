package aqa_hw_2;

import aqa_hw_2.dto.CategoryDto;
import aqa_hw_2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutPetTests {

    @Test
    public void verifyPetCanBeModified(){
        int petIdToCreate = 988776655;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("mops");
        String petNameToCreate = "Villy";
        String status = "sold";

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

        categoryDto.setName("chau-chau");
        String petNameToUpdate = "Knopka";
        String statusToUpdate = "available";

        petDtoToCreate.setName(petNameToUpdate);
        petDtoToCreate.setStatus(statusToUpdate);
        petDtoToCreate.setCategory(categoryDto);

        Response updatePetResponse = given()
                .contentType("application/json")
                .body(petDtoToCreate)
                .put("https://petstore.swagger.io/v2/pet");
        PetDto putResponseDto = updatePetResponse.as(PetDto.class);
        Assert.assertEquals(petIdToCreate, putResponseDto.getId());

        Response previouslyUpdatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyUpdatedPetDto = previouslyUpdatedPetResponse.as(PetDto.class);
        Assert.assertEquals(petIdToCreate, previouslyUpdatedPetDto.getId());
        Assert.assertEquals(categoryDto.getName(), previouslyUpdatedPetDto.getCategory().getName());
        Assert.assertEquals(petNameToUpdate, previouslyUpdatedPetDto.getName());
        Assert.assertEquals(statusToUpdate, previouslyUpdatedPetDto.getStatus());

    }
}
