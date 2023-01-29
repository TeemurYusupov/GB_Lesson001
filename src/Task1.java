public class Task1 {
    //Task1
// Заполните массив случайным
// числами и выведите максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random(),
// который возвращает значение в промежутке [0, 300].

    public static void main(String[] args) {

        int num = 20;
        int sum = 0;
        double mid = 0;

        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 300);
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        int max = array[0];
        int min = array[0];


        for (int j = 0; j < num; j++) {
            if (array[j] > max) {
                max = array[j];
            }                                    //нахождение максимального значения

            if (array[j] < min) {    //нахождение минимального значения
                min = array[j];
            }

            sum += array[j];


        }
        mid = sum / num;


        System.out.println(max);

        System.out.println(min);

        System.out.println(mid);
    }
}