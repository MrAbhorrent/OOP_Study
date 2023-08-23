package com.study.gb.Seminar07;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int chooseOperation;
        System.out.println("Введите первое комплексное число.");
        ComplexNumber complexNumber1 = inputComplexNumber();
        System.out.println("Введите второе комплексное число.");
        ComplexNumber complexNumber2 = inputComplexNumber();
        do {
            System.out.print("Выберите операцию ['+' = 1, '-' = 2, '*' = 3, '/' = 4 ] : ");
            chooseOperation = scanner.nextInt();
            if (chooseOperation >=1 && chooseOperation <= 4) {
                break;
            } else {
                System.out.println("Введите правильный номер.");
            }
        } while (true);
        System.out.printf("Первое комплесное число = %s\n", complexNumber1);
        System.out.printf("Второе комплесное число = %s\n", complexNumber2);
        System.out.printf("Операция = %s\n", chooseOperation);
        Operation operation;
        switch (chooseOperation) {
            case 1:
                operation = Operation.ADD;
                break;
            case 2:
                operation = Operation.MINUS;
                break;
            case 3:
                operation = Operation.MULTIPLY;
                break;
            case 4:
                operation = Operation.DIVIDE;
                break;
            default:
                operation = null;
        }

        System.out.println(operation);
        
    }

    private static ComplexNumber inputComplexNumber() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите реальную часть комплесного числа: ");
        float realPartNumber = scanner1.nextFloat();
        System.out.print("Введите мнимую часть комлексного числа: ");
        float imaginaryPartNumber = scanner1.nextFloat();
        return new ComplexNumber(realPartNumber, imaginaryPartNumber);
    }
}
