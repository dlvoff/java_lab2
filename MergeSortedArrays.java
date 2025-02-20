public class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] merged = new int[len1 + len2];

        int i = 0, j = 0, k = 0;

        // Объединяем массивы, пока не достигнем конца одного из них.
        // Если элемент в arr1 меньше чем в arr2, добавляем его в merged и перемещаем указатель
        // и наоборот
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Если в arr1 остались элементы, добавляем их в merged
        while (i < len1) {
            merged[k++] = arr1[i++];
        }

        // Если в arr2 остались элементы, добавляем их в merged
        while (j < len2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10, 11, 12};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.print("Объединенный массив: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();
    }
}