package com.denisantonov.data;

public class MirCard extends Card{

    public MirCard() {
        super(PaymentSystem.MIR);
    }

    protected boolean isCountryValidForThisCard(Country country){
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}
