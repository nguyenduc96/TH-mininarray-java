public class Main {

    public static void main(String[] args) {
        int[] arrayNumber = {4, 12, 7, 8, 1, 6, 9, 3, 13, 45, 9};
        int[] valueMinIndex = minValue(arrayNumber);
        System.out.printf("Số nhỏ nhất trong mảng là %d ở vị trí % d", valueMinIndex[0], valueMinIndex[1]);
    }

    public static int[] minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return new int[] {min, index};
    }
}