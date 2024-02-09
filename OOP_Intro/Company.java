package org.example.entites;

public class Company extends Customer {

    public Company(String taxNumber, String companyName) {
        TaxNumber = taxNumber;
        CompanyName = companyName;
    }

    public String TaxNumber;

    public String CompanyName;

    public String getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        TaxNumber = taxNumber;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }
}
