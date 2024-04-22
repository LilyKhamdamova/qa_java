package com.example;

import java.util.Arrays;
import java.util.List;

public class AlexTheLion extends Lion {


    public AlexTheLion(String sex, Feline feline) throws Exception {
        super(sex, feline);
    }

    public List<String> getFriends() {
        return Arrays.asList("Marty", "Gloria", "Melman");
    }

    public String getPlaceOfLiving() {
        return "New York Zoo";
    }

    @Override
    public int getKittens() {
        return 0; // Алекс не имеет котят
    }

}
