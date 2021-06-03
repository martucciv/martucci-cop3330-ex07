package ex07;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;
import java.lang.Math;

public class Area {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Area app = new Area();
        double length = app.inputLength();
        double width = app.inputWidth();
        double areaFt = app.calcAreaInFeet(length, width);
        double metric = app.calcMetric(areaFt);
        app.printOutput(length, width, areaFt, metric);
    }

    public double inputLength(){
        System.out.print("What is the length of the room in feet? ");
        String lenStr = input.nextLine();
        return Double.parseDouble(lenStr);
    }

    public double inputWidth(){
        System.out.print("What is the width of the room in feet? ");
        String widthStr = input.next();
        return Double.parseDouble(widthStr);
    }

    public double calcAreaInFeet(double length, double width){
        return length * width;
    }

    public double calcMetric(double areaFt){
        return Math.sqrt(Math.pow(areaFt, 2) * 0.09290304);
    }

    public void printOutput(double length, double width, double areaFt, double metric){
        System.out.printf("You entered dimensions of %.3f feet by %.3f feet.\n", length, width);
        System.out.printf("The area is\n%.3f square feet\n%.3f square meters", areaFt, metric);

    }
}
