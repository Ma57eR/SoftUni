import java.util.Scanner;

public class Case {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //-------------- 1 задача ------------------------

//        int dayOfWeek = Integer.parseInt(scanner.nextLine());
//
//        switch (dayOfWeek) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Error");
//                break;
//        }

        //-------------- 2 задача ------------------------

//        String animal = scanner.nextLine();
//
//        switch (animal) {
//
//            case "dog":
//                System.out.println("mammal");
//                break;
//            case "crocodile":
//                System.out.println("reptile");
//                break;
//            case "tortoise":
//                System.out.println("reptile");
//                break;
//            case "snake":
//                System.out.println("reptile");
//                break;
//            default:
//                System.out.println("unknown");
//                break;
//
//        }

        //-------------- 3 задача ------------------------

//        double age = Double.parseDouble(scanner.nextLine());
//        String sex = scanner.nextLine();
//
//        if (age >= 16) {
//            if (sex.equals("m")) {
//                System.out.println("Mr.");
//            } else {
//                System.out.println("Ms.");
//            }
//        } else {
//            if (sex.equals("m")) {
//                System.out.println("Master");
//            } else {
//                System.out.println("Miss");
//            }
//        }


        //-------------- 4 задача ------------------------

//        String product = scanner.nextLine();
//        String city = scanner.nextLine();
//        double count = Double.parseDouble(scanner.nextLine());
//        double price = 0;
//
//
//        if (city.equals("Sofia")) {
//            if (product.equals("coffee")) {
//                System.out.println(count * 0.50);
//            } else if (product.equals("water")) {
//                System.out.println(count * 0.80);
//            } else if (product.equals("beer")) {
//                System.out.printf("%.2f",count * 1.20);
//            } else if (product.equals("sweets")) {
//                System.out.println(count * 1.45);
//            } else if (product.equals("peanuts")) {
//                System.out.println(count * 1.60);
//            }
//        } else if (city.equals("Plovdiv")) {
//            if (product.equals("coffee")) {
//                System.out.println(count * 0.40);
//            } else if (product.equals("water")) {
//                System.out.println(count * 0.70);
//            } else if (product.equals("beer")) {
//                System.out.println(count * 1.15);
//            } else if (product.equals("sweets")) {
//                System.out.println(count * 1.30);
//            } else if (product.equals("peanuts")) {
//                System.out.println(count * 1.50);
//            }
//        } else if (city.equals("Varna")) {
//            if (product.equals("coffee")) {
//                System.out.println(count * 0.45);
//            } else if (product.equals("water")) {
//                System.out.println(count * 0.70);
//            } else if (product.equals("beer")) {
//                System.out.println(count * 1.10);
//            } else if (product.equals("sweets")) {
//                System.out.println(count * 1.35);
//            } else if (product.equals("peanuts")) {
//                System.out.println(count * 1.55);
//            }
//        }

        //-------------- 5 задача ------------------------


//        int number = Integer.parseInt(scanner.nextLine());
//
//        if (number == 0) {
//            System.out.println("No");
//        } else if (number >= -100 && number <= 100) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

        //-------------- 6 задача ------------------------


//        String fruit = scanner.nextLine();
//
//        if (fruit.equals("banana") ||
//                fruit.equals("apple") ||
//                fruit.equals("kiwi") ||
//                fruit.equals("cherry") ||
//                fruit.equals("lemon") ||
//                fruit.equals("grapes")) {
//            System.out.println("fruit");
//        } else if (fruit.equals("tomato") ||
//                fruit.equals("cucumber") ||
//                fruit.equals("pepper") ||
//                fruit.equals("carrot")) {
//            System.out.println("vegetable");
//
//        } else {
//            System.out.println("unknown");
//        }

        //-------------- 7 задача ------------------------


//        int number = Integer.parseInt(scanner.nextLine());
//
//        if (number != 0) {
//            if (number >= 100 && number <= 200) {
//            } else {
//                System.out.println("invalid");
//            }
//        } else {
//        }

        //-------------- 8 задача ------------------------


//        String fruit = scanner.nextLine();
//        String day = scanner.nextLine();
//        double count = Double.parseDouble(scanner.nextLine());
//
//        switch (day) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                if (fruit.equals("banana")) {
//                    System.out.printf("%.2f",count * 2.50);
//                } else if (fruit.equals("apple")) {
//                    System.out.printf("%.2f", count * 1.20);
//                } else if (fruit.equals("orange")) {
//                    System.out.printf("%.2f",count * 0.85);
//                }else if (fruit.equals("grapefruit")) {
//                    System.out.printf("%.2f",count * 1.45);
//                }else if (fruit.equals("kiwi")) {
//                    System.out.printf("%.2f",count * 2.70);
//                }else if (fruit.equals("pineapple")) {
//                    System.out.printf("%.2f",count * 5.50);
//                } else if (fruit.equals("grapes")) {
//                    System.out.printf("%.2f",count * 3.85);
//                } else {
//                    System.out.println("error");
//                }
//                break;
//            case "Saturday":
//            case "Sunday":
//                if (fruit.equals("banana")) {
//                    System.out.printf("%.2f",count * 2.70);
//                } else if (fruit.equals("apple")) {
//                    System.out.printf("%.2f",count * 1.25);
//                } else if (fruit.equals("orange")) {
//                    System.out.printf("%.2f",count * 0.90);
//                }else if (fruit.equals("grapefruit")) {
//                    System.out.printf("%.2f",count * 1.60);
//                }else if (fruit.equals("kiwi")) {
//                    System.out.printf("%.2f",count * 3.00);
//                }else if (fruit.equals("pineapple")) {
//                    System.out.printf("%.2f",count * 5.60);
//                }else if (fruit.equals("grapes")) {
//                    System.out.printf("%.2f",count * 4.20);
//                }else {
//                    System.out.println("error");
//                }
//                break;
//            default:
//                System.out.println("error");
//        }


    }
}
