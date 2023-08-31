package com.workintech.plants.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class FruitResponse {
    private int status;
    private String message;
    private long timestamp;
}
