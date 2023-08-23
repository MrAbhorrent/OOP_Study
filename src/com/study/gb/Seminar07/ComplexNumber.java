package com.study.gb.Seminar07;

public class ComplexNumber {
    private float re;
    private float im;

    public ComplexNumber(float re, float im) {
        setRe(re);
        setIm(im);
    }

    public ComplexNumber(float reValue) {
        this(reValue, 0);
    }

    public ComplexNumber() {
        this(0);
    }

    public float getRe() {
        return re;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public float getIm() {
        return im;
    }

    public void setIm(float im) {
        this.im = im;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        if (this.re != 0) {
            stringBuilder.append(this.re);
        } else stringBuilder.append("0");
        if (this.im != 0) {
            if (this.im < 0) {
                stringBuilder.append(" - ");
            } else {
                stringBuilder.append(" + ");
            }
            stringBuilder
                    .append(this.im)
                    .append("i");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
