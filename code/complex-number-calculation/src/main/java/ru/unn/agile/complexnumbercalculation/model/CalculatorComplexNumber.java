package ru.unn.agile.complexnumbercalculation.model;

public class CalculatorComplexNumber {
    private ComplexNumber z1;
    private ComplexNumber z2;

    public CalculatorComplexNumber() {
        z1 = new ComplexNumber();
        z2 = new ComplexNumber();
    }


    public CalculatorComplexNumber(final ComplexNumber userZ1, final ComplexNumber userZ2) {
       z1 = userZ1;
       z2 = userZ2;
    }

    public ComplexNumber getZ1() {
        return z1;
    }

    public ComplexNumber getZ2() {
        return z2;
    }

}
