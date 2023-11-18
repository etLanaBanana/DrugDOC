package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class GeneraleRecipeKey {
    public String nameDoc;
    public String titleDrug;
    public String patient;
    public String dateOfAction;
    public int availableCount;
    public String keyWord;

    @Override
    public String toString() {
        return "|         РЕЦЕПТУРНЫЙ БЛАНК №107-1/у        |" + "\n" +
                "____________________________________________" + "\n" +
                "|Название лекарства: " + titleDrug + "\n" +
                "|Ф.И.О врача: " + nameDoc + "\n" +
                "|Ф.И.О пациента: " + patient + "\n" +
                "|Рецепт действителен в течении: " + dateOfAction + "\n" +
                "|Доступное количество упаковок: " + availableCount + "\n" +
                "____________________________________________" + "\n";
    }
}
