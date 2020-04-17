import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        //int - само цели числа
        //double - дробни числа 0.5, 3.14 ....
        //char - единични символи 'а', 'б' ....
        //String - текст(низ) "Здрасти", "Какво правиш"....

//        int number = 34;
//        double price = 52.33;
//        char symbol = '@';
//        String name = "Goshko";
//        double check = 0.1;


        //1. Read name
        //2. print name -> "Hello, <name>!"
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        //System.out.printf("Hello, %s!", name);
//        //Или
//        System.out.print("Hello, ");
//        System.out.print(name);
//        System.out.println("!");
        // NextLine взима стойността от всеки ред
        Scanner scanner = new Scanner(System.in);
        //int money = Integer.parseInt(scanner.nextLine());

        //System.out.printf("Изтеглихте %s лева", money);

        //double decimalNumber  =  Double.parseDouble(scanner.nextLine());
        //System.out.println(decimalNumber);


        //Знака за % е остатък - модулно деление
//        int a = 25;
//        double i = 25.0 % 4;
//        System.out.println(i);

        double up = Math.round(45.4);
        // Math.ceil - закръгля нагоре
        //Math.floor - закръгля надолу
        //Math.abs - абсолютната стойност на числото
        System.out.println(up);

        //За другия урок
        //1. read input
        //2. calculate volume in cm ^ 3
        //3, calculate volume in liters
        //4. used space
        //5. calculate free space



    }
}