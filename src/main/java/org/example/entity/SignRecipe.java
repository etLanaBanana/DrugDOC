package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SignRecipe {
    public String title;
    public String uniqueKeyRecipe;
    public String uniqueKeyPharmacist;
}
