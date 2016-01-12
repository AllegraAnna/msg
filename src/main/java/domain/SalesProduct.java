package domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "salesProductId",
    "currency",
    "contractStart",
    "contractEnd"
})
public class SalesProduct {

    @JsonProperty("salesProductId")
    private Integer salesProductId;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("contractStart")
    private String contractStart;
    @JsonProperty("contractEnd")
    private String contractEnd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The salesProductId
     */
    @JsonProperty("salesProductId")
    public Integer getSalesProductId() {
        return salesProductId;
    }

    /**
     *
     * @param salesProductId The salesProductId
     */
    @JsonProperty("salesProductId")
    public void setSalesProductId(Integer salesProductId) {
        this.salesProductId = salesProductId;
    }

    /**
     *
     * @return The currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return The contractStart
     */
    @JsonProperty("contractStart")
    public String getContractStart() {
        return contractStart;
    }

    /**
     *
     * @param contractStart The contractStart
     */
    @JsonProperty("contractStart")
    public void setContractStart(String contractStart) {
        this.contractStart = contractStart;
    }

    /**
     *
     * @return The contractEnd
     */
    @JsonProperty("contractEnd")
    public String getContractEnd() {
        return contractEnd;
    }

    /**
     *
     * @param contractEnd The contractEnd
     */
    @JsonProperty("contractEnd")
    public void setContractEnd(String contractEnd) {
        this.contractEnd = contractEnd;
    }

}
