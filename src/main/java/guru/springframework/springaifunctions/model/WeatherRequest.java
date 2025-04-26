package guru.springframework.springaifunctions.model;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

/**
 * Created by jt, Spring Framework Guru.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonClassDescription("Weather API request using latitude and longitude")
public record WeatherRequest(
        @JsonProperty(required = true, value = "latitude") @JsonPropertyDescription("Latitude of desired location.") Double latitude,
        @JsonProperty(required = true,value="longitude") @JsonPropertyDescription("Longitude of desired location.") String longitude) {
}
