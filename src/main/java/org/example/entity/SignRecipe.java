package org.example.entity;

import lombok.*;

@Builder
@AllArgsConstructor
@ToString
@Getter
@Setter
public class SignRecipe {
    public String title;
    public String uniqueKeyRecipe;
    public String uniqueKeyPharmacist;
}
