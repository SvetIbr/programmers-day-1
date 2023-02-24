import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // здесь нужно вывести результат
            System.out.println("12.09." + year); //isLeapYear вернул true - високосный
        } else {
            System.out.println("13.09." + year); //isLeapYear вернул false - не високосный
        }
    }

    public static boolean isLeapYear(int year) {
        // метод определяет, является ли переданный год високосным
        if(year%400 == 0) { // если год кратен 400, он високосный, возвращаем true
            return true;
        } else if(year%100 == 0) { //если год кратен 100, он не високосный, возвращаем false
            return false;
        } else if (year%4 == 0) { //проверяем остальные годы - если кратен 4 високосный, - возвращаем true
            return true;
        }
        return false; //остальные годы не високосные, возвращаем false
    }
} 