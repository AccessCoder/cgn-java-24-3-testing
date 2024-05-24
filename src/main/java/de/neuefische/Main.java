package de.neuefische;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static String gradeToText(int grade){
        if (grade == 1){
            return "Sehr gut!";
        } else if (grade == 2) {
            return "Gut!";
        } else if (grade == 3) {
            return "Befriedigend";
        } else if (grade == 4) {
            return "Ausreichend";
        } else if (grade == 5) {
            return "Mangelhaft";
        } else if (grade == 6) {
            return "Ungenügend";
        }else {
            return "Bitte geben Sie eine Valide Zahl zwischen 1-6 ein!";
        }
    }
}