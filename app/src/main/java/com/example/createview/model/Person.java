package com.example.createview.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private String name;
    private String surname;
    private String description;
    private String followingNumber;
    private String followersNumber;
    private String image;
}
