package com.denisantonov.data;

public class MasterCard extends Card{

    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }

    protected boolean isCountryValidForThisCard(Country country){
        return true;
    }
}
