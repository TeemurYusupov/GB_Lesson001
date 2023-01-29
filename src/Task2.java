import java.util.Arrays;

public class Task2 {
//    Task2
//    Реализуйте алгоритм сортировки пузырьком для сортировки массива

    public static void main(String[] args) {

        int num = 10;
        int sum = 0;
        double mid = 0;

        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + ", ");

        }
        System.out.println();

        boolean isSorted = false;
        int buf;

        while(!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length-1; i++) {

                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

}
