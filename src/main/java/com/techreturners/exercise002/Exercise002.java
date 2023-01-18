package com.techreturners.exercise002;

import com.techreturners.exercise001.User;

public class Exercise002 {

    private static final String MANCHESTER = "Manchester";
    public boolean isFromManchester(Person person) {
         return person != null && MANCHESTER.equalsIgnoreCase(person.getCity());
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person != null && person.getAge() >= ageLimit;
    }
    
}
