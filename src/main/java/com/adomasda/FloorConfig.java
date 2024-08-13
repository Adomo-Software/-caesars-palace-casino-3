package com.adomasda;

import java.util.Arrays;
import java.util.List;

public class FloorConfig {
    private final List<Object> floorElements;

    public FloorConfig(Object... floorElements) {
        this.floorElements = Arrays.asList(floorElements);
    }
}