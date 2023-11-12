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
}
