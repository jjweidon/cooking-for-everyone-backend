package cookingforeveryone.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Getter @Builder
public class RequestDto {
    @JsonProperty("id")
    private Long userId;
    @JsonProperty("password")
    private String userPassword;
}
