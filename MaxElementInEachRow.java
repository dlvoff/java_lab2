public class MaxElementInEachRow {

    public static int[] findMaxElementsInRows(int[][] matrix) {
        int rows = matrix.length;
        int[] maxElements = new int[rows];
        
        // Проходим по всем строкам матрицы
        for (int i = 0; i < rows; i++) {
            int max = matrix[i][0];

            // Проходим по всем элементам в текущей строке
            for (int j = 1; j < matrix[i].length; j++) {

                // Сравниваем текущий элемент с максимальным
                if (matrix[i][j] > max) {

                    // Если текущий элемент больше, обновляем максимальный элемент
                    max = matrix[i][j];
                }
            }
            
            // Сохраняем максимальный элемент в соответствующую позицию в массиве maxElements
            maxElements[i] = max;
        }
        return maxElements;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, -6, 4},
                {4, 5, 8, 7},
                {11, 8, 9, 10}
        };
        int[] maxElements = findMaxElementsInRows(matrix);
        System.out.println("Максимальные элементы в каждой строке:");
        for (int i = 0; i < maxElements.length; i++) {
            System.out.println("Строка " + (i + 1) + ": " + maxElements[i]);
        }
    }
}