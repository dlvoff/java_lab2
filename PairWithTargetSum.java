public class PairWithTargetSum {

    public static int[] findPairWithSum(int[] nums, int target) {

        // Проходим по всем элементам массива
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // Проверяем, равна ли сумма текущих элементов заданному значению target
                if (nums[i] + nums[j] == target) {

                    // Если пара найдена, возвращаем ее в виде массива
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        
        // Если пара не найдена, возвращаем null
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {10, 15, 3, 9, 9};
        int target = 18;
        int[] result = findPairWithSum(nums, target);

        if (result != null) {
            System.out.println("Найдена пара: " + result[0] + " и " + result[1]);
        } else {
            System.out.println("Пара не найдена.");
        }
    }
}