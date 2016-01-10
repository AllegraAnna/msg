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
    "productId",
    "garage",
    "constructionYear",
    "region",
    "dateOfBirthYoungest",
    "objectValue",
    "type",
    "insuredObject",
    "salesProduct",
    "productType"
})
public class Product {

    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("garage")
    private String garage;
    @JsonProperty("constructionYear")
    private Integer constructionYear;
    @JsonProperty("region")
    private String region;
    @JsonProperty("dateOfBirthYoungest")
    private String dateOfBirthYoungest;
    @JsonProperty("objectValue")
    private Integer objectValue;
    @JsonProperty("type")
    private String type;
    @JsonProperty("insuredObject")
    private InsuredObject insuredObject;
    @JsonProperty("salesProduct")
    private SalesProduct salesProduct;
    @JsonProperty("productType")
    private String productType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The productId
     */
    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    /**
     *
     * @param productId The productId
     */
    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     *
     * @return The garage
     */
    @JsonProperty("garage")
    public String getGarage() {
        return garage;
    }

    /**
     *
     * @param garage The garage
     */
    @JsonProperty("garage")
    public void setGarage(String garage) {
        this.garage = garage;
    }

    /**
     *
     * @return The constructionYear
     */
    @JsonProperty("constructionYear")
    public Integer getConstructionYear() {
        return constructionYear;
    }

    /**
     *
     * @param constructionYear The constructionYear
     */
    @JsonProperty("constructionYear")
    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    /**
     *
     * @return The region
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     *
     * @param region The region
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     *
     * @return The dateOfBirthYoungest
     */
    @JsonProperty("dateOfBirthYoungest")
    public String getDateOfBirthYoungest() {
        return dateOfBirthYoungest;
    }

    /**
     *
     * @param dateOfBirthYoungest The dateOfBirthYoungest
     */
    @JsonProperty("dateOfBirthYoungest")
    public void setDateOfBirthYoungest(String dateOfBirthYoungest) {
        this.dateOfBirthYoungest = dateOfBirthYoungest;
    }

    /**
     *
     * @return The objectValue
     */
    @JsonProperty("objectValue")
    public Integer getObjectValue() {
        return objectValue;
    }

    /**
     *
     * @param objectValue The objectValue
     */
    @JsonProperty("objectValue")
    public void setObjectValue(Integer objectValue) {
        this.objectValue = objectValue;
    }

    /**
     *
     * @return The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return The insuredObject
     */
    @JsonProperty("insuredObject")
    public InsuredObject getInsuredObject() {
        return insuredObject;
    }

    /**
     *
     * @param insuredObject The insuredObject
     */
    @JsonProperty("insuredObject")
    public void setInsuredObject(InsuredObject insuredObject) {
        this.insuredObject = insuredObject;
    }

    /**
     *
     * @return The salesProduct
     */
    @JsonProperty("salesProduct")
    public SalesProduct getSalesProduct() {
        return salesProduct;
    }

    /**
     *
     * @param salesProduct The salesProduct
     */
    @JsonProperty("salesProduct")
    public void setSalesProduct(SalesProduct salesProduct) {
        this.salesProduct = salesProduct;
    }

    /**
     *
     * @return The productType
     */
    @JsonProperty("productType")
    public String getProductType() {
        return productType;
    }

    /**
     *
     * @param productType The productType
     */
    @JsonProperty("productType")
    public void setProductType(String productType) {
        this.productType = productType;
    }
    
}
