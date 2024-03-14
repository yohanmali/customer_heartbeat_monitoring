package com.cricket.demo.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Players {
    private Name name;
    private int age;
    private LocalDate dob;
    private int gamesPlayed;
    private double avg;
    private int bestScore;
}
