package com.denisantonov.data;

public class UnionPayCard extends Card{

    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }

    protected boolean isCountryValidForThisCard(Country country){
        if (country == Country.CN)
            return true;
        else
            return false;
    }
}
