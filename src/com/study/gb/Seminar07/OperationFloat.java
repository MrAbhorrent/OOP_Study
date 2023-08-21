package com.study.gb.Seminar07;

public class OperationFloat implements ICalculation<Float> {
    @Override
    public Float add(Float arg1, Float arg2) {
        return arg1 + arg2;
    }

    @Override
    public Float minus(Float arg1, Float arg2) {
        return arg1 - arg2;
    }

    @Override
    public Float multiply(Float arg1, Float arg2) {
        return arg1 * arg2;
    }

    @Override
    public Float divide(Float arg1, Float arg2) {
        if (arg2 != 0) {
            return arg1 / arg2;
        }
        return null;
    }
}
