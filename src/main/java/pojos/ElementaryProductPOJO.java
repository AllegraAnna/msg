/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import domain.ElementaryProduct;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "elementary_product")
@XmlRootElement
public class ElementaryProductPOJO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "elementary_product_id")
    private Integer elementaryProductId;
    @Column(name = "bonus_malus")
    private Integer bonusMalus;
    @Column(name = "deductible")
    private Integer deductible;
    @Column(name = "comprehensive")
    private Integer comprehensive;
    @Column(name = "partial")
    private Integer partial;
    @Column(name = "legacy_premium")
    private Integer legacyPremium;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "garage")
    private boolean garage;
    @Column(name = "construction_year")
    private Integer constructionYear;
    @Size(max = 10)
    @Column(name = "region")
    private String region;
    @Column(name = "date_of_birth_youngest")
    private Date dateOfBirthYoungest;
    @Column(name = "object_value")
    private Integer objectValue;
    @Size(max = 50)
    @Column(name = "type")
    private String type;
    @Size(max = 250)
    @Column(name = "product_type")
    private String productType;
    @Size(max = 200)
    @Column(name = "name")
    private String name;
    @Size(max = 50)
    @Column(name = "owners_name")
    private String ownersName;
    @Column(name = "mileage")
    private Integer mileage;
    @Column(name = "engine_capacity")
    private Integer engineCapacity;
    @Column(name = "sales_product_id")
    private Integer salesProductId;
    @Size(max = 3)
    @Column(name = "currency")
    private String currency;
    @Column(name = "contract_start")
    private Date contractStart;
    @Column(name = "contract_end")
    private Date contractEnd;
    @Column(name = "premium_calculation")
    private double premiumCalculation;

    public ElementaryProductPOJO(ElementaryProduct elementaryProduct, double premiumCalculation) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.elementaryProductId = elementaryProduct.getElementaryProductId();
        this.bonusMalus = elementaryProduct.getBonusMalus();
        this.deductible = elementaryProduct.getDeductible();
        this.comprehensive = elementaryProduct.getComprehensive();
        this.partial = elementaryProduct.getPartial();
        this.legacyPremium = elementaryProduct.getLegacyPremium();
        this.productId = elementaryProduct.getProduct().getProductId();
        this.garage = Boolean.parseBoolean(elementaryProduct.getProduct().getGarage());
        this.constructionYear = elementaryProduct.getProduct().getConstructionYear();
        this.region = elementaryProduct.getProduct().getRegion();
        try {
            this.dateOfBirthYoungest = sdf.parse(elementaryProduct.getProduct().getDateOfBirthYoungest());
        } catch (ParseException ex) {
            Logger.getLogger(ElementaryProductPOJO.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.objectValue = elementaryProduct.getProduct().getObjectValue() ;
        this.type = elementaryProduct.getProduct().getType();
        this.productType = elementaryProduct.getProduct().getProductType();
        this.name = elementaryProduct.getProduct().getInsuredObject().getName();
        this.ownersName = elementaryProduct.getProduct().getInsuredObject().getOwnersName();
        this.mileage = elementaryProduct.getProduct().getInsuredObject().getMileage();
        this.engineCapacity = elementaryProduct.getProduct().getInsuredObject().getEngineCapacity();
        this.salesProductId = elementaryProduct.getProduct().getSalesProduct().getSalesProductId();
        this.currency = elementaryProduct.getProduct().getSalesProduct().getCurrency();
        try {
            this.contractStart = sdf.parse(elementaryProduct.getProduct().getSalesProduct().getContractStart());
        } catch (ParseException ex) {
            Logger.getLogger(ElementaryProductPOJO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.contractEnd = sdf.parse(elementaryProduct.getProduct().getSalesProduct().getContractEnd());
        } catch (ParseException ex) {
            Logger.getLogger(ElementaryProductPOJO.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.premiumCalculation = premiumCalculation;
    }
    
    

    public Integer getElementaryProductId() {
        return elementaryProductId;
    }

    public void setElementaryProductId(Integer elementaryProductId) {
        this.elementaryProductId = elementaryProductId;
    }

    public Integer getBonusMalus() {
        return bonusMalus;
    }

    public void setBonusMalus(Integer bonusMalus) {
        this.bonusMalus = bonusMalus;
    }

    public Integer getDeductible() {
        return deductible;
    }

    public void setDeductible(Integer deductible) {
        this.deductible = deductible;
    }

    public Integer getComprehensive() {
        return comprehensive;
    }

    public void setComprehensive(Integer comprehensive) {
        this.comprehensive = comprehensive;
    }

    public Integer getPartial() {
        return partial;
    }

    public void setPartial(Integer partial) {
        this.partial = partial;
    }

    public Integer getLegacyPremium() {
        return legacyPremium;
    }

    public void setLegacyPremium(Integer legacyPremium) {
        this.legacyPremium = legacyPremium;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Date getDateOfBirthYoungest() {
        return dateOfBirthYoungest;
    }

    public void setDateOfBirthYoungest(Date dateOfBirthYoungest) {
        this.dateOfBirthYoungest = dateOfBirthYoungest;
    }

    public Integer getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(Integer objectValue) {
        this.objectValue = objectValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Integer getSalesProductId() {
        return salesProductId;
    }

    public void setSalesProductId(Integer salesProductId) {
        this.salesProductId = salesProductId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getContractStart() {
        return contractStart;
    }

    public void setContractStart(Date contractStart) {
        this.contractStart = contractStart;
    }

    public Date getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
    }

    public double getPremiumCalculation() {
        return premiumCalculation;
    }

    public void setPremiumCalculation(double premiumCalculation) {
        this.premiumCalculation = premiumCalculation;
    }
    
}
