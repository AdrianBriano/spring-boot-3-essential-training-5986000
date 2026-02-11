package com.frankmoley.lil.roomwebapp.async;

import lombok.Data;

import java.util.UUID;

@Data
public class AsyncPayload {
    private UUID id;
    private String model;
}
