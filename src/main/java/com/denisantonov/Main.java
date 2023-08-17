package com.denisantonov;

import com.denisantonov.data.Card;
import com.denisantonov.data.MasterCard;
import com.denisantonov.data.UnionPayCard;

import static com.denisantonov.data.Country.RU;


public class Main {

    public static void main(String[] args) {
        invoke(new UnionPayCard());
//        masterCard.setBalance(100);
//        masterCard.payInCountry(RU, 50);
//        System.out.println(masterCard.getBalance());
    }

    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(RU, 50);
        System.out.println("Current balance: " + card.getBalance());
    }
}
