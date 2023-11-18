package org.example.entity;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter

public class SignRecipe {
    public String title;
    public String uniqueKeyRecipe;
    public String uniqueKeyPharmacist;

    @Override
    public String toString() {
        return "Название лекарства: " + title + "\n" +
                "Уникальный ключ рецепта: " + uniqueKeyRecipe + "\n" +
                "Уникальный ключ фармацевта: " + uniqueKeyPharmacist;
    }
}
