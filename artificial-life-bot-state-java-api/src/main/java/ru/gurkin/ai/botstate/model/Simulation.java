package ru.gurkin.ai.botstate.model;

import lombok.Data;

import java.util.Set;

@Data
public class Simulation {
    private String id;
    private String ownerId;
    private int maxX;
    private int maxY;
    private Set<String> sliceIds;
}
