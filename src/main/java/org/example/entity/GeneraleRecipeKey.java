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


}
