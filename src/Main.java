import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вес(кг)");
        double num1 = in.nextDouble();
        System.out.print("Введите рост(м)");
        double num2 = in.nextDouble();
        System.out.print(num1/num2/num2);
    }
}