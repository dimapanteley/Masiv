public class Main {
    public static void main(String[] args) {
        // Создание массива с числами от 1 до 5
        int[] numbers = { 1, 2, 3, 4, 5, };

        // Вывод исходного массива на экран
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        // Переворачивание массива (реверс)
        for (int i = 0; i < numbers.length / 2; i++) {
            // Обмен значений между элементами, чтобы перевернуть массив
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        // Вывод массива после реверса на экран
        System.out.println("\nМассив после реверса:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}