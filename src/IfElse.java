import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String a = "Hi";
//        String b = scanner.nextLine();
        //a.equals(b); -> Сравнява стрингове
        //Стрингове никога не се сравняват с ==
//        System.out.println(a.equals(b));
        //if ( condition ) { actoin }


        //1ва задача
//        double ocenka = Double.parseDouble(scanner.nextLine());
//
//        if (ocenka >= 5.50) {
//            System.out.println("Excellent!");
//        }

        //2ра задача

//        double teglene = Double.parseDouble(scanner.nextLine());
//        double nalichni = 100.0;
//
//
//        if (teglene <= nalichni) {
//            System.out.printf("Теглене на %s лева", teglene);
//        } else {
//            System.out.println("Няма достатъчно пари");
//        }

        //----------2ра задача----------------

//        int a = Integer.parseInt(scanner.nextLine());
//        int b = Integer.parseInt(scanner.nextLine());
//
//        if (a > b) {
//            System.out.println(a);
//
//        } else {
//            System.out.println(b);
//        }


        //------------3та задача-----------------
//        int a = Integer.parseInt(scanner.nextLine());
//        int evenOdd = a % 2;
//
//        if (evenOdd == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }

//        String color = "black";
//
//        if (color.equals("red")) {
//            System.out.println("Tomato");
//        } else if (color.equals("yellow")) {
//            System.out.println("banana");
//        } else if (color.equals("green")) {
//            System.out.println("Apple");
//        } else {
//            System.out.println("Iba li ga");
//        }

        //--------4та задача-------------

//        int number = Integer.parseInt(scanner.nextLine());
//
//        if (number == 1) {
//            System.out.println("one");
//        } else if (number == 2) {
//            System.out.println("two");
//        }  else if (number == 9) {
//            System.out.println("nine");
//        } else if (number == 3) {
//            System.out.println("three");
//        } else if (number == 4) {
//            System.out.println("four");
//        } else if (number == 5) {
//            System.out.println("five");
//        } else if (number == 6) {
//            System.out.println("six");
//        } else if (number == 7) {
//            System.out.println("seven");
//        } else if (number == 8) {
//            System.out.println("eight");
//        } else {
//            System.out.println("number too big");
//        }


        //-----------5та задача--------------

//        int number = Integer.parseInt(scanner.nextLine());
//
//        if (number < 100) {
//            System.out.println("Less than 100");
//        } else if (number <= 200) {
//            System.out.println("Between 100 and 200");
//        } else if (number > 200) {
//            System.out.println("Greater than 200");
//        }


        //-----------6та задача--------------

//        String password = scanner.nextLine();
//
//        if (password.equals("s3cr3t!P@ssw0rd")) {
//            System.out.println("Welcome");
//        } else {
//            System.out.println("Wrong password!");
//        }

        //-----------6та задача--------------


        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double lenght = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", lenght*lenght);
        } else if (figure.equals("rectangle")) {
            double recLength = Double.parseDouble(scanner.nextLine());
            double recWidth = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", recLength * recWidth);
        } else if (figure.equals("circle")) {
            double cirRadius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",Math.PI * (cirRadius * cirRadius));
        } else if (figure.equals("triangle")) {
            double triX = Double.parseDouble(scanner.nextLine());
            double triY = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (triX * triY)/2);
        }

    }

}