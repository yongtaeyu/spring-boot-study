package com.example.demo.ch5;

import com.example.demo.ch4.Singer;


public class GreatGuitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("I shot the sheriff, \n" +
                "But I did not shoot the deputy");
    }
}
