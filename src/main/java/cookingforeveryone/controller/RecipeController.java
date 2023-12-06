package cookingforeveryone.controller;

import cookingforeveryone.domain.Recipe;
import cookingforeveryone.dto.RecipeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/recipes")
public class RecipeController {

    // 맞춤형 레시피 추천
    @GetMapping("/recipes")
    public List<RecipeDto> getRecipes() {
        // 맞춤형 레시피 추천 로직을 수행합니다.
        // 입력된 식재료를 기반으로 데이터베이스에서 레시피를 조회하는 등의 작업을 수행합니다.
        // 디폴트로 빈 리스트를 반환합니다.레시피를 찾으면 RecipeDto를 생성하여 반환합니다.
        return List.of();
    }

    // 레시피 상세 정보 조회
    @GetMapping("/recipe/detail/{recipeId}")
    public RecipeDto getRecipeDetail(@PathVariable Long recipeId) {
        // 주어진 recipeId에 해당하는 레시피의 상세 정보 조회 로직을 수행합니다.
        // 데이터베이스에서 레시피를 조회하고 recipeId에 해당하는 레시피 정보를 찾습니다.
        // 디폴트로 빈 RecipeDto를 반환합니다. 레시피를 찾으면 해당 RecipeDto를 생성하여 반환합니다.
        return new RecipeDto();
    }

    // 랜덤 메뉴 추천
    @GetMapping("/recipe/random")
    public RecipeDto getRandomRecipe() {
        // 데이터베이스에서 랜덤하게 하나의 레시피를 조회하여 반환하는 로직을 수행합니다.
        // 디폴트로 빈 RecipeDto를 반환합니다. 랜덤한 레시피를 찾으면 해당 RecipeDto를 생성하여 반환합니다.
        return new RecipeDto();
    }
}
