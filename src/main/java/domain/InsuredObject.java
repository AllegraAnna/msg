package domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "ownersName",
    "mileage",
    "engineCapacity"
})
public class InsuredObject {

    @JsonProperty("name")
    private String name;
    @JsonProperty("ownersName")
    private String ownersName;
    @JsonProperty("mileage")
    private Integer mileage;
    @JsonProperty("engineCapacity")
    private Integer engineCapacity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return The ownersName
     */
    @JsonProperty("ownersName")
    public String getOwnersName() {
        return ownersName;
    }

    /**
     *
     * @param ownersName The ownersName
     */
    @JsonProperty("ownersName")
    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    /**
     *
     * @return The mileage
     */
    @JsonProperty("mileage")
    public Integer getMileage() {
        return mileage;
    }

    /**
     *
     * @param mileage The mileage
     */
    @JsonProperty("mileage")
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    /**
     *
     * @return The engineCapacity
     */
    @JsonProperty("engineCapacity")
    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    /**
     *
     * @param engineCapacity The engineCapacity
     */
    @JsonProperty("engineCapacity")
    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    
}
