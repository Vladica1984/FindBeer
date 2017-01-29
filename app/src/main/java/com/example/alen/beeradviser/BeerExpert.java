package com.example.alen.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alen on 29-Jan-17.
 */

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            if (color.equals("light")) {
                brands.add("Jail Pale Ale");
                brands.add("Gout Stout");
            } else {
                if (color.equals("dark")) {
                    brands.add("Niksicko tamno");
                    brands.add("MB tamno");
                } else {
                    brands.add("Jelen");
                    brands.add("Lav");
                }
            }
        } return brands;
    }
}



