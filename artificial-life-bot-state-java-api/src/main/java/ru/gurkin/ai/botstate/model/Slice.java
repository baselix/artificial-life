package ru.gurkin.ai.botstate.model;

import lombok.Data;

import java.util.Set;

@Data
public class Slice {
    private String id;
    private Set<String> botIds;
}
