package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RecipeApiResponse {

    @JsonProperty("COOKRCP01")
    private RecipeResult cookRcp;
    
    @Data
    public static class RecipeResult {
        private List<RecipeDTO> row;
    }
    
    @Data
    public static class RecipeDTO {
        @JsonProperty("RCP_NM")
        private String name;

        @JsonProperty("RCP_WAY2")
        private String way;

        @JsonProperty("RCP_PAT2")
        private String type;

        @JsonProperty("RCP_PARTS_DTLS")
        private String ingredients;

        @JsonProperty("ATT_FILE_NO_MAIN")
        private String imageUrl;
    }
}