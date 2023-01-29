
import java.util.Scanner;
public class Task3 {
    //    Task3
//    Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//    Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
//
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        System.out.print("Введите размер массива: ");
//        int num = in.nextInt();
        int num = 20;

        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = i + 1;
            if (array[i] % array[i] == 0) {
                System.out.print(array[i] + " ");

            }
        }
        System.out.println();

        for(int i = 2; i <= num; i ++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(i +" ");
            }
        }

    }
}