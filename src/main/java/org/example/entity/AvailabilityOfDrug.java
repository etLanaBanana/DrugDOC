package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AvailabilityOfDrug { // наличие лекарств
    public String titleDrug;
    public int remains; //остаток
//    @Override
//    public String toString() {
//        return "Название препарата: " + titleDrug + ". Доступный остаток: " + remains + " пачек/пачка" + "\n";
//    }
}
