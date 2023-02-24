package HomeWork;

import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getNum();
        int num2 = getNum();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат:" + result);
    }
    public static int getNum(){
        int num;
        System.out.println("Введите число: ");
        if(scan.hasNext()) {
            num = scan.nextInt();
        } else {
            System.out.println("Ошибка ввода числа. Повторите попытку");
            scan.next();
            num = getNum();
        }
        return num;
    }
    public static char getOperation(){
        char operation;
        System.out.println("Вводите операцию: ");
        if(scan.hasNext()){
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Ошибка ввода операции. Повторите попытку");
            scan.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc (int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1 + num2; break;
            case '-':
                result = num1 - num2; break;
            case '*':
                result = num1 * num2; break;
            case '/':
                result = num1 / num2;break;
            default:
                System.out.println("Ошибка ввода. Повторите попытку");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
