import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class OperationsExcercise {
    public static void main(String[] args) {

        //Име, тип и стойност
        // За да въведем въведеното от конзолата, трябва да използваме scanner.nextLine или друг тип scanner.next
        Scanner scanner = new Scanner(System.in);
        //double number = Double.parseDouble(scanner.nextLine());

        //%.2f да изпринти дабъла до втория знак. %n е да сложи нов ред
//        String name = scanner.nextLine();
//        String sport = scanner.nextLine();
//        int age = Integer.parseInt(scanner.nextLine());
//        String town = scanner.nextLine();


//        System.out.printf("I am %s and I like %s. I am %d and live in %s.", name, sport, age, town);
        //System.out.printf("%.3f%n",number);
        // 1. read input -> usd
        //2. convert
        //3. print -> 2 sign

//        double usd = Double.parseDouble(scanner.nextLine());
//        double bgn = usd * 1.79549;
//        System.out.printf("%.2f USD are %.2f BGN", usd, bgn);

        //-------------------2ра задача----------------------
        //1. Read input
        //2. Пресмятане от радиани в градуси

//        double radians = Double.parseDouble(scanner.nextLine());
//        double degrees = radians * 180 / Math.PI;
//        System.out.printf("%.0f", degrees);

        //-------------------3та задача----------------------
        //1. Read input
        //2. Пресмятане на площ на правоъгълник
        //3. изход Double с 2 знака след десетичната

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double length = Math.abs(x1 - x2);
        double width = Math.abs(y1 - y2);

        double square = 2 * (length + width);
        double area = length * width;

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", square);




        //-------------------5та задача----------------------
        // 1. Read Input - > Hall sizes, Shelf, Скамейка / 0.1 от Hall.

//        double hallLength = Double.parseDouble(scanner.nextLine());
//        double hallwidth = Double.parseDouble(scanner.nextLine());
//        double shelf = Double.parseDouble(scanner.nextLine());
//        double shelftotal = (shelf * 100) * (shelf * 100) ;
//        double skameika = (hallLength * 100) * (hallwidth * 100) * 0.1;
//        double halltotal = (hallLength * 100) * (hallwidth * 100) - shelftotal - skameika;
//        double dancer = halltotal / 7040;
//        System.out.printf("%.0f", Math.floor(dancer));



        //-------------------7ма задача----------------------
        //1. Read input
        //2. Пресмятане на площ на правоъгълник
        //3. изход Double с 2 знака след десетичната

//        double priceWhiskey = Double.parseDouble(scanner.nextLine());
//        double priceRakia = priceWhiskey * 0.5;
//        double priceWine = priceRakia * 0.6;
//        double priceBeer = priceRakia * 0.2;
//        double countBeer = Double.parseDouble(scanner.nextLine());
//        double countWine = Double.parseDouble(scanner.nextLine());
//        double countRakia = Double.parseDouble(scanner.nextLine());
//        double countWhiskey = Double.parseDouble(scanner.nextLine());
//        double finalPrice = countWhiskey * priceWhiskey + countRakia * priceRakia + countWine * priceWine + countBeer * priceBeer;
//
//        System.out.printf("%.2f", finalPrice);
       // System.out.println(countWhiskey * priceWhiskey);
        //System.out.println(countRakia * priceRakia);

    }
}