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


//        int hour = Integer.parseInt(scanner.nextLine());
//        int minutes = Integer.parseInt(scanner.nextLine());
//        int totalMinutes = hour * 60 + minutes;
//        int totalMinutes15 = totalMinutes + 15;
//        int endHour = totalMinutes15 / 60;
//        int endMinutes = totalMinutes15 % 60;
//
//
//        if (endHour == 24) {
//            endHour = 0;
//        }
//
//        System.out.printf("%d:%02d",endHour, endMinutes);


        //---------------- 6 задача ------------------------

//        double budget = Double.parseDouble(scanner.nextLine());
//        double decor = budget * 0.1;
//        int persons = Integer.parseInt(scanner.nextLine());
//        double costPerPerson = Double.parseDouble(scanner.nextLine());
//        double totalCost = costPerPerson * persons + decor;
//
//
//        //If costPersons > budget
//        //Not enough money
//        //Winguard needs {how much more} leva more.
//
//        if (persons > 150) {
//            costPerPerson = costPerPerson * 0.9;
//            totalCost = costPerPerson * persons + decor;
//        }
//        if (budget < totalCost) {
//
//            System.out.println("Not enough money!");
//            System.out.printf("Wingard needs %.2f leva more.", totalCost - budget);
//        } else {
//            System.out.println("Action!");
//            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalCost);
//        }


        //---------------- 7 задача ------------------------

        //Input 1 -> Record in seconds
        //Input 2 -> Length in Meters
        //Input 3 -> Seconds for 1 meter

//        Double record = Double.parseDouble(scanner.nextLine());
//        Double length = Double.parseDouble(scanner.nextLine());
//        Double secPerMeter = Double.parseDouble(scanner.nextLine());
//        Double swimmingTime = secPerMeter * length;
//        Double slowing = Math.floor(length / 15) * 12.5;
//        Double totalTime = swimmingTime + slowing;
//
//        System.out.println(swimmingTime);
//        System.out.println(slowing);
//        System.out.println(totalTime);
//
//
//
//        if (totalTime < record) {
//            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
//        } else {
//            System.out.printf("No, he failed! He was %.2f seconds slower.",totalTime - record);
//        }

        //---------------- 8 задача ------------------------


//        double income = Double.parseDouble(scanner.nextLine());
//        double avgRaiting = Double.parseDouble(scanner.nextLine());
//        double minSalary = Double.parseDouble(scanner.nextLine());
//        double socialSchol = 0.0;
//        double ratSchol = 0.0;
//
//        if (income > minSalary) {
//            if (avgRaiting > 5.5) {
//                socialSchol = minSalary * 0.35;
//                System.out.printf("You get a Social scholarship %.0f BGN", socialSchol);
//            } else {
//                System.out.println("You cannot get a scholarship!");
//            }
//        } else if (avgRaiting >= 5.5) {
//            if (avgRaiting * 0.25 > minSalary * 0.35) {
//                System.out.printf("You get a scholarship for excellent results %.0f BGN", avgRaiting * 0.25);
//            } else {
//                socialSchol = minSalary * 0.35;
//                System.out.printf("You get a Social scholarship %.0f BGN", socialSchol);
//            }
//        } else {
//            System.out.println("You cannot get a scholarship!");
//        }





    }
}
