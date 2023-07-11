import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int[] numbers = {10, -7, 0, -5, 8, 0};
        String formattedNumbers = formatNumbers(numbers);
        System.out.println(formattedNumbers);
    }*/

    /*    for (Currency currency : Currency.values()) {

            System.out.println(currency.ordinal() + 1 +" " +currency.name());
        }
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println(Currency.USD);
                break;
            case 2:
                System.out.println(Currency.EUR);
                break;
            case 3:
                System.out.println(Currency.RUB);
                break;
            case 4:
                System.out.println(Currency.JPY);
                break;
            case 5:
                System.out.println(Currency.AVD);
            break;
            default:
                System.out.println("takogo netu");

        }*/

 /*   public static String formatNumbers(int[] numbers) {
        StringBuilder sb = new StringBuilder();
//        int[] numbers = {10, -7, 0, -5, 8, 0};
        for (int formatNumbers : numbers) {
            if (formatNumbers > 0)
                sb.append("[").append(formatNumbers).append("]");
            else if (formatNumbers < 0) {
                sb.append("{").append(formatNumbers).append("}");

            }else
                sb.append("zero");


//                System.out.println(formatNumbers);
                }
        return sb.toString();*/

        for (Days days : Days.values()) {
            System.out.println(days.ordinal() + 1 + " " + days.name());
        
        }
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        switch (days) {
            case 1:
                System.out.println(Days.Monday);
                break;
            case 2:
                System.out.println(Days.Tuesday);
                break;
            default:
                System.out.println("takogo netu");
        }

    }
}


