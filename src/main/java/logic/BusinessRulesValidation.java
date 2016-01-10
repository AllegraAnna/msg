/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.ElementaryProduct;
import org.joda.time.LocalDate;
import org.joda.time.Years;

public class BusinessRulesValidation {

    public boolean isValidFrom(LocalDate startDate) {
        return startDate.isAfter(new LocalDate(2011, 12, 1));
    }

    public boolean isValidCurrency(String currency) {
        return currency.toUpperCase().equals("EUR");
    }

    public boolean isValidDuration(LocalDate startDate, LocalDate endDate) {
        return Years.yearsBetween(startDate, endDate).getYears() == 1;
    }

    public boolean isValidRegion(String region) {
        return region.toUpperCase().equals("EAST");
    }

    public boolean isValidAgeMinimum(LocalDate age) {
        return Years.yearsBetween(age, new LocalDate()).getYears() >= 18;
    }

    public boolean isValidAgeMaximum(LocalDate age) {
        return Years.yearsBetween(age, new LocalDate()).getYears() <= 65;
    }

    public boolean isCarMileageValid(int mileage) {
        return mileage <= 250000;
    }

    public boolean isCarYearValid(int year) {
        return year >= 1980;
    }

    public boolean isBonusMalusValid(int malus) {
        return malus >= -10;
    }

    public void isProductValid(ElementaryProduct elementaryProduct) throws Exception {
        if (!isValidFrom(new LocalDate(elementaryProduct.getProduct().getSalesProduct().getContractStart()))) {
            throw new Exception("Sales product's start date is not valid!");
        }
        if (!isValidCurrency(elementaryProduct.getProduct().getSalesProduct().getCurrency())) {
            throw new Exception("Sales product's currency is not valid!");
        }
        if (!isValidDuration(new LocalDate(elementaryProduct.getProduct().getSalesProduct().getContractStart()), new LocalDate(elementaryProduct.getProduct().getSalesProduct().getContractEnd()))) {
            throw new Exception("Sales product's contract dates are not valid!");
        }
        if (!isValidRegion(elementaryProduct.getProduct().getRegion())) {
            throw new Exception("Product's region is not valid!");
        }
        if (!isValidAgeMinimum(new LocalDate(elementaryProduct.getProduct().getDateOfBirthYoungest()))) {
            throw new Exception("Insured person's minimum age is not valid!");
        }
        if (!isValidAgeMaximum(new LocalDate(elementaryProduct.getProduct().getDateOfBirthYoungest()))) {
            throw new Exception("Insured person's maximum age is not valid!");
        }
    }

    public void isCarValid(ElementaryProduct elementaryProduct) throws Exception {
        if (!isCarMileageValid(elementaryProduct.getProduct().getInsuredObject().getMileage())) {
            throw new Exception("Car's mileage is not valid!");
        }  
        if (!isCarYearValid(elementaryProduct.getProduct().getConstructionYear())) {
            throw new Exception("Car's construction year is not valid!");
        }
        if (!isBonusMalusValid(elementaryProduct.getBonusMalus())) {
            throw new Exception("Bonus malus is not valid!");
        }
    }

}
