import java.util.Scanner;

public class IfElseExcercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //---------------- 1 задача ------------------------

//        int timeFirst = Integer.parseInt(scanner.nextLine());
//        int timeSecond = Integer.parseInt(scanner.nextLine());
//        int timeThird = Integer.parseInt(scanner.nextLine());
//        int timeTotal = timeFirst + timeSecond + timeThird;
//        int minutes = timeTotal / 60;
//        int seconds = timeTotal % 60;

//        System.out.println(minutes);
//        System.out.println(seconds);

//        if (seconds < 10) {
//            System.out.printf("%d:0%d", minutes, seconds);
//        } else {
//            System.out.printf("%d:%d", minutes, seconds);
//        }

        //---------------- 2 задача ------------------------

//        int score = Integer.parseInt(scanner.nextLine());
//        double bonus = 0;
//        double totalScore = score + bonus;
//
//        if (score <= 100) {
//            bonus = 5;
//
//        } else if (score <= 1000) {
//            bonus = (score * .2);
//            totalScore = score + bonus;
//        } else if (score > 1000) {
//            bonus = (score * .1);
//            totalScore = score + bonus;
//        }
//        if (score % 2 == 0) {
//            bonus = bonus + 1;
//        } else if (score % 10 == 5) {
//            bonus = bonus + 2;
//        }
//
//        System.out.println(bonus);
//        System.out.println(score+bonus);
//


        //---------------- 3 задача ------------------------


        //double speed = Double.parseDouble(scanner.nextLine());

//        if (speed <= 10) {
//            System.out.println("slow");
//        } else if (speed <= 50) {
//            System.out.println("average");
//        } else if (speed <= 150) {
//            System.out.println("fast");
//        } else if (speed <= 1000) {
//            System.out.println("ultra fast");
//        } else if (speed > 1000) {
//            System.out.println("extremely fast");
//        }


        //---------------- 5 задача ------------------------


        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int time = hour * 60 + minutes;

        System.out.println(time);



    }
}
