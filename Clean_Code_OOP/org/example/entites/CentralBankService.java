package org.example.entites;

public class CentralBankService implements IBankService{

    @Override
    public double convertRate(CurrecyRate currencyRate) {
        return CurrecyRate.Price/(double)30.61;
    }
}
