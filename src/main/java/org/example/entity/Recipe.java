package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Recipe {
    public String titleDrug;
    public String nameDoc;
    public String patient;
    public String dateOfAction;
    public int totalQuantity;
    public String uniqueKey;

    @Override
    public String toString() {
        return "|         РЕЦЕПТУРНЫЙ БЛАНК №107-1/у        |" + "\n" +
                "____________________________________________" + "\n" +
                "|Название лекарства: " + titleDrug + "\n" +
                "|Ф.И.О врача: " + nameDoc + "\n" +
                "|Ф.И.О пациента: " + patient + "\n" +
                "|Рецепт действителен в течении: " + dateOfAction + "\n" +
                "|Доступное количество упаковок: " + totalQuantity + "\n" +
                "____________________________________________";
    }
}

