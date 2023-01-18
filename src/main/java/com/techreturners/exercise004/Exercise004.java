package com.techreturners.exercise004;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private final LocalDateTime dateTime;

    private static final Long GIGA_SECOND = BigInteger
            .valueOf(10)
            .pow(9)
            .longValue();

    public Exercise004(LocalDate date) {
        this.dateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime.plusSeconds(GIGA_SECOND);
    }

    public LocalDateTime getLocalDateTime() {
        return dateTime;
    }


}
