package cookingforeveryone.repository;

import cookingforeveryone.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<User, Long> {
}
