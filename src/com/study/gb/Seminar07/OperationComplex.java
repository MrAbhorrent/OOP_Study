package com.study.gb.Seminar07;

public class OperationComplex implements ICalculation<ComplexNumber> {

    @Override
    public ComplexNumber add(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        return new ComplexNumber(
                complexNumber1.getRe() + complexNumber2.getRe(),
                complexNumber1.getIm() + complexNumber2.getIm());
    }

    @Override
    public ComplexNumber minus(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
        return new ComplexNumber(
                complexNumber1.getRe() - complexNumber2.getRe(),
                complexNumber1.getIm() - complexNumber2.getIm());
    }

    @Override
    public ComplexNumber multiply(ComplexNumber arg1, ComplexNumber arg2) {
        float multiplyRe = arg1.getRe() * arg2.getRe() - arg1.getIm() * arg2.getIm();
        float multiplyIm = arg1.getRe() * arg2.getIm() + arg1.getIm() * arg2.getRe();
        return new ComplexNumber(multiplyRe, multiplyIm);
    }

    @Override
    public ComplexNumber divide(ComplexNumber complexNumber1, ComplexNumber complexNumber2){
        float divDenominator = complexNumber2.getRe() * complexNumber2.getRe() + complexNumber2.getIm() * complexNumber2.getIm();
        float divideRe =(complexNumber1.getRe() * complexNumber2.getRe() + complexNumber1.getIm() * complexNumber2.getIm())/divDenominator;
        float divideIm =(complexNumber1.getIm() * complexNumber2.getRe() - complexNumber1.getRe() * complexNumber2.getIm())/divDenominator;
        return new ComplexNumber(divideRe, divideIm);
    }
}
