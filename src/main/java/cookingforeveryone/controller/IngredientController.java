package cookingforeveryone.controller;

import cookingforeveryone.domain.Ingredient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    // 추가
    @PostMapping("/api/add")
    public String add(@RequestBody Ingredient ingredient) {
        // 입력 받은 ingredient를 데이터베이스에 저장하는 등의 비즈니스 로직을 수행합니다.
        // 입력된 식재료 이름을 반환합니다.
        return "Added ingredient: " + ingredient.getName();
    }

    // 삭제
    @DeleteMapping("api//delete/{id}")
    public String delete(@PathVariable Long id) {
        // 주어진 id에 해당하는 재료를 데이터베이스에서 삭제하는 등의 비즈니스 로직을 수행합니다.
        // 삭제된 재료의 ID를 반환합니다.
        return "Deleted ingredient with ID: " + id;
    }

    // 수정
    @PutMapping("api/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Ingredient updatedIngredient) {
        // 주어진 id에 해당하는 재료를 데이터베이스에서 찾아 업데이트하는 등의 비즈니스 로직을 수행합니다.
        // updatedIngredient에는 업데이트된 식재료의 정보가 담겨 있습니다.
        // 업데이트된 재료의 ID와 이름을 반환합니다.
        return "Updated ingredient with ID " + id + ": " + updatedIngredient.getName();
    }
}
