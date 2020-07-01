import javax.swing.*;
import java.util.Scanner;

public class moreCases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //-------------------- 1 задача ------------------------

//        double x1 = Double.parseDouble(scanner.nextLine());
//        double y1 = Double.parseDouble(scanner.nextLine());
//        double x2 = Double.parseDouble(scanner.nextLine());
//        double y2 = Double.parseDouble(scanner.nextLine());
//        double x = Double.parseDouble(scanner.nextLine());
//        double y = Double.parseDouble(scanner.nextLine());
//
//        boolean firstCondition = (x == x1 || x == x2) && (y >= y1 && y <= y2);
//        boolean secondCondition = (y == y1 || y == y2) && (x >= x1 && x <= x2);
//
//        if (firstCondition || secondCondition) {
//            System.out.println("Border");
//        } else {
//            System.out.println("Inside / Outside");
//        }


        //-------------------- 2 задача ------------------------


//        String type = scanner.nextLine();
//        int rows = Integer.parseInt(scanner.nextLine());
//        int columns = Integer.parseInt(scanner.nextLine());
//        double Premiere = 12;
//        double Normal = 7.5;
//        double Discount = 5;
//
//        switch (type) {
//            case "Premiere":
//                System.out.printf("%.2f leva", rows * columns * Premiere);
//                break;
//            case "Normal":
//                System.out.printf("%.2f leva",rows * columns * Normal);
//                break;
//            case "Discount":
//                System.out.printf("%.2f leva",rows * columns * Discount);
//                break;
//            default:
//                System.out.println("error");
//        }


        //-------------------- 3 задача ------------------------

//        int degrees = Integer.parseInt(scanner.nextLine());
//        String time = scanner.nextLine();
//
//        if (degrees >= 10 && degrees <= 18) {
//            switch (time) {
//                case "Morning":
//                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, "Sweatshirt", "Sneakers");
//                    break;
//                case "Afternoon":
//                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, "Shirt", "Moccasins");
//                    break;
//                case "Evening":
//                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, "Shirt", "Mocassins");
//                    break;
//                default:
//                    System.out.println("error");
//            }
//        } else if (degrees > 18 && degrees <= 24) {
//            switch (time) {
//                case "Morning":
//                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, "Shirt", "Sneakers");
//                    break;
//                case "Afternoon":
//                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, "T-Shirt", "Sandals");
//                    break;
//                case "Evening":
//                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, "Shirt", "Moccasins");
//                    break;
//                default:
//                    System.out.println("error");
//            }
//        } else if (degrees > 24) {
//            switch (time) {
//                case "Morning":
//                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, "T-Shirt", "Sandals");
//                    break;
//                case "Afternoon":
//                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, "Swim Suit", "Barefoot");
//                    break;
//                case "Evening":
//                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, "Shirt", "Moccasins");
//                    break;
//                default:
//                    System.out.println("error");
//            }
//        } else {
//            System.out.println("error");
//        }


        //-------------------- 4 задача ------------------------


//        String flowers = scanner.nextLine();
//        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
//        int budget = Integer.parseInt(scanner.nextLine());
//        double flowerPrice;
//
//        switch (flowers) {
//            case "Roses":
//                flowerPrice = 5;
//                if (numberOfFlowers <= 80) {
//                    if (numberOfFlowers * flowerPrice < budget) {
//                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - numberOfFlowers * flowerPrice);
//                    } else {
//                        System.out.printf("Not enough money, you need %.2f leva more.", numberOfFlowers * flowerPrice - budget);
//                    }
//                } else if (numberOfFlowers > 80) {
//                    flowerPrice = flowerPrice * 0.9;
//                    if (numberOfFlowers * flowerPrice < budget) {
//                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - numberOfFlowers * flowerPrice);
//                    } else {
//                        System.out.printf("Not enough money, you need %.2f leva more.", numberOfFlowers * flowerPrice - budget);
//                    }
//                }
//                break;
//            case "Dahlias":
//                flowerPrice = 3.8;
//                if (numberOfFlowers <= 90) {
//                    if (numberOfFlowers * flowerPrice < budget) {
//                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - numberOfFlowers * flowerPrice);
//                    } else {
//                        System.out.printf("Not enough money, you need %.2f leva more.", numberOfFlowers * flowerPrice - budget);
//                    }
//                } else if (numberOfFlowers > 90) {
//                    flowerPrice = flowerPrice * 0.85;
//                    if (numberOfFlowers * flowerPrice < budget) {
//                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - numberOfFlowers * flowerPrice);
//                    } else {
//                        System.out.printf("Not enough money, you need %.2f leva more.", numberOfFlowers * flowerPrice - budget);
//                    }
//                }
//                break;
//            case "Tulips":
//                flowerPrice = 2.8;
//                if (numberOfFlowers <= 80) {
//                    if (numberOfFlowers * flowerPrice < budget) {
//                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - numberOfFlowers * flowerPrice);
//                    } else {
//                        System.out.printf("Not enough money, you need %.2f leva more.", numberOfFlowers * flowerPrice - budget);
//                    }
//                } else if (numberOfFlowers > 80) {
//                    flowerPrice = flowerPrice * 0.85;
//                    if (numberOfFlowers * flowerPrice < budget) {
//                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - numberOfFlowers * flowerPrice);
//                    } else {
//                        System.out.printf("Not enough money, you need %.2f leva more.", numberOfFlowers * flowerPrice - budget);
//                    }
//                }
//                break;
//            case "Narcissus":
//                flowerPrice = 3;
//                if (numberOfFlowers >= 120) {
//                    if (numberOfFlowers * flowerPrice < budget) {
//                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - numberOfFlowers * flowerPrice);
//                    } else {
//                        System.out.printf("Not enough money, you need %.2f leva more.", numberOfFlowers * flowerPrice - budget);
//                    }
//                } else if (numberOfFlowers < 120) {
//                    flowerPrice = flowerPrice * 1.15;
//                    if (numberOfFlowers * flowerPrice < budget) {
//                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - numberOfFlowers * flowerPrice);
//                    } else {
//                        System.out.printf("Not enough money, you need %.2f leva more.", numberOfFlowers * flowerPrice - budget);
//                    }
//                }
//                break;
//            case "Gladiolus":
//                flowerPrice = 2.5;
//                if (numberOfFlowers >= 80) {
//                    if (numberOfFlowers * flowerPrice < budget) {
//                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - numberOfFlowers * flowerPrice);
//                    } else {
//                        System.out.printf("Not enough money, you need %.2f leva more.", numberOfFlowers * flowerPrice - budget);
//                    }
//                } else if (numberOfFlowers < 80) {
//                    flowerPrice = flowerPrice * 1.2;
//                    if (numberOfFlowers * flowerPrice < budget) {
//                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowers, budget - numberOfFlowers * flowerPrice);
//                    } else {
//                        System.out.printf("Not enough money, you need %.2f leva more.", numberOfFlowers * flowerPrice - budget);
//                    }
//                }
//                break;
//            default:
//                System.out.println("error");
//        }


        //-------------------- 5 задача ------------------------

//        double budget = Integer.parseInt(scanner.nextLine());
//        String season = scanner.nextLine();
//        int fisherman = Integer.parseInt(scanner.nextLine());
//        double boatPrice=0;
//
//        switch (season) {
//            case "Spring":
//                boatPrice = 3000;
//                if (fisherman < 7) {
//                    boatPrice = boatPrice * 0.9;
//                } else if (fisherman > 6 && fisherman < 12) {
//                    boatPrice = boatPrice * 0.85;
//                } else if (fisherman > 12) {
//                    boatPrice = boatPrice * 0.75;
//                }
//                if (fisherman % 2 == 0) {
//                    boatPrice = boatPrice * 0.95;
//               }
//                break;
//            case "Autumn":
//                boatPrice = 4200;
//                if (fisherman < 7) {
//                    boatPrice = boatPrice * 0.9;
//                } else if (fisherman > 6 && fisherman < 12) {
//                    boatPrice = boatPrice * 0.85;
//                } else if (fisherman > 12) {
//                    boatPrice = boatPrice * 0.75;
//                }
//                break;
//            case "Summer":
//                boatPrice = 4200;
//                if (fisherman < 7) {
//                    boatPrice = boatPrice * 0.9;
//                } else if (fisherman > 6 && fisherman < 12) {
//                    boatPrice = boatPrice * 0.85;
//                } else if (fisherman > 12) {
//                    boatPrice = boatPrice * 0.75;
//                }
//                if (fisherman % 2 == 0) {
//                    boatPrice = boatPrice * 0.95;
//                }
//                break;
//            case "Winter":
//                boatPrice = 2600;
//                if (fisherman < 7) {
//                    boatPrice = boatPrice * 0.9;
//                } else if (fisherman > 6 && fisherman < 12) {
//                    boatPrice = boatPrice * 0.85;
//                } else if (fisherman > 12) {
//                    boatPrice = boatPrice * 0.75;
//                }
//                if (fisherman % 2 == 0) {
//                    boatPrice = boatPrice * 0.95;
//                }
//                break;
//
//
//            }
//
//        if (budget > boatPrice) {
//            System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
//        } else
//            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);



        //-------------------- 6 задача ------------------------

//        double budget = Double.parseDouble(scanner.nextLine());
//        String season = scanner.nextLine();
//        String destination;
//        double spent;
//
//        switch (season) {
//            case "summer":
//                if (budget <= 100) {
//                    destination = "Bulgaria";
//                    spent = budget * 0.3;
//
//                    System.out.printf("Somewhere in %s%n", destination);
//                    System.out.printf("Camp - %.2f", spent);
//                } else if (budget > 100 && budget <= 1000) {
//                    destination = "Balkans";
//                    spent = budget * 0.4;
//
//                    System.out.printf("Somewhere in %s%n", destination);
//                    System.out.printf("Camp - %.2f", spent);
//                } else if (budget > 1000) {
//                    destination = "Europe";
//                    spent = budget * 0.9;
//
//                    System.out.printf("Somewhere in %s%n", destination);
//                    System.out.printf("Hotel - %.2f", spent);
//                    }break;
//                case "winter":
//                if (budget <= 100) {
//                    destination = "Bulgaria";
//                    spent = budget * 0.7;
//
//                    System.out.printf("Somewhere in %s%n", destination);
//                    System.out.printf("Hotel - %.2f", spent);
//                } else if (budget > 100 && budget <= 1000) {
//                    destination = "Balkans";
//                    spent = budget * 0.8;
//
//                    System.out.printf("Somewhere in %s%n", destination);
//                    System.out.printf("Hotel - %.2f", spent);
//                } else if (budget > 1000){
//                    destination = "Europe";
//                    spent = budget * 0.9;
//
//                    System.out.printf("Somewhere in %s%n", destination);
//                    System.out.printf("Hotel - %.2f", spent);
//                } break;
//        }


        //-------------------- 7 задача ------------------------


        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int result;
        String func = scanner.nextLine();

        switch (func) {
            case "+":
                if (n1 + n2 % 2 == 0) {
                    result = (int) (n1 + n2);
                System.out.printf("%s + %s = %s - even", n1, n2, result);
            } else {
                    result = (int) (n1 + n2);
                    System.out.printf("%s + %s = %s - odd", n1, n2, result);
            }
                break;
            case "-":
                if (n1 - n2  % 2 == 0) {
                    result = (int) (n1 - n2);
                    System.out.printf("%s - %s = %s - even", n1, n2, result);
                } else {
                    result = (int) (n1 - n2);
                    System.out.printf("%s - %s = %s - odd", n1, n2, result);
                }
                break;
            case "*":
                if (n1 * n2  % 2 == 0) {
                    result = (int) (n1 * n2);
                    System.out.printf("%s * %s = %s - even", n1, n2, result);
                } else {
                    result = (int) (n1 * n2);
                    System.out.printf("%s * %s = %s - odd", n1, n2, result);
                }
                break;
            case "/":
                if (n1 != 0) {
                    if (n2 != 0) {
                        System.out.printf("%s / %s = %.2f", n1, n2, n1 / n2);
                    } else {
                        System.out.printf("Cannot divide %s by zero", n1);
                    }
                } else {
                    System.out.printf("Cannot divide %s by zero", n2);
                }
                break;
            case "%":
            if (n1 != 0) {
                if (n2 != 0) {
                    int result2 = (int) (n1 % n2);
                    char c = '%';
                    System.out.printf("%s %s %s = %d", n1, c, n2, result2);
                } else {
                    System.out.printf("Cannot divide %s by zero", n2);
                }
            } else {
                System.out.printf("Cannot divide %s by zero", n1);
            }
        }



    }
}
