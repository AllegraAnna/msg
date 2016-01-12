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
    "elementaryProductId",
    "bonusMalus",
    "deductible",
    "comprehensive",
    "partial",
    "legacyPremium",
    "product"
})
public class ElementaryProduct {

    @JsonProperty("elementaryProductId")
    private Integer elementaryProductId;
    @JsonProperty("bonusMalus")
    private Integer bonusMalus;
    @JsonProperty("deductible")
    private Integer deductible;
    @JsonProperty("comprehensive")
    private Integer comprehensive;
    @JsonProperty("partial")
    private Integer partial;
    @JsonProperty("legacyPremium")
    private Integer legacyPremium;
    @JsonProperty("product")
    private Product product;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return The elementaryProductId
     */
    @JsonProperty("elementaryProductId")
    public Integer getElementaryProductId() {
        return elementaryProductId;
    }

    /**
     *
     * @param elementaryProductId The elementaryProductId
     */
    @JsonProperty("elementaryProductId")
    public void setElementaryProductId(Integer elementaryProductId) {
        this.elementaryProductId = elementaryProductId;
    }

    /**
     *
     * @return The bonusMalus
     */
    @JsonProperty("bonusMalus")
    public Integer getBonusMalus() {
        return bonusMalus;
    }

    /**
     *
     * @param bonusMalus The bonusMalus
     */
    @JsonProperty("bonusMalus")
    public void setBonusMalus(Integer bonusMalus) {
        this.bonusMalus = bonusMalus;
    }

    /**
     *
     * @return The deductible
     */
    @JsonProperty("deductible")
    public Integer getDeductible() {
        return deductible;
    }

    /**
     *
     * @param deductible The deductible
     */
    @JsonProperty("deductible")
    public void setDeductible(Integer deductible) {
        this.deductible = deductible;
    }

    /**
     *
     * @return The comprehensive
     */
    @JsonProperty("comprehensive")
    public Integer getComprehensive() {
        return comprehensive;
    }

    /**
     *
     * @param comprehensive The comprehensive
     */
    @JsonProperty("comprehensive")
    public void setComprehensive(Integer comprehensive) {
        this.comprehensive = comprehensive;
    }

    /**
     *
     * @return The partial
     */
    @JsonProperty("partial")
    public Integer getPartial() {
        return partial;
    }

    /**
     *
     * @param partial The partial
     */
    @JsonProperty("partial")
    public void setPartial(Integer partial) {
        this.partial = partial;
    }

    /**
     *
     * @return The legacyPremium
     */
    @JsonProperty("legacyPremium")
    public Integer getLegacyPremium() {
        return legacyPremium;
    }

    /**
     *
     * @param legacyPremium The legacyPremium
     */
    @JsonProperty("legacyPremium")
    public void setLegacyPremium(Integer legacyPremium) {
        this.legacyPremium = legacyPremium;
    }

    /**
     *
     * @return The product
     */
    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    /**
     *
     * @param product The product
     */
    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ElementaryProduct{" + "elementaryProductId=" + elementaryProductId + ", bonusMalus=" + bonusMalus + ", deductible=" + deductible + ", comprehensive=" + comprehensive + ", partial=" + partial + ", legacyPremium=" + legacyPremium + ", product=" + product + ", additionalProperties=" + additionalProperties + '}';
    }
    
}

