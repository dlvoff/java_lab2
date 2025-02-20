public class RotateMatrix {
    public static int[][] rotateMatrix(int[][] matrix) {

        // Получаем размеры исходной матрицы
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Создаем новый массив с измененными размерами
        int[][] rotated = new int[cols][rows];

        // Заполняем новый массив элементами из исходного массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotated[j][rows - 1 - i] = matrix[i][j]; // Поворачиваем элемент
            }
        }
        return rotated;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10}
        };
        int[][] rotatedMatrix = rotateMatrix(matrix);
        System.out.println("Повернутая матрица:");
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}