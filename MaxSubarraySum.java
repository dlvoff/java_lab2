public class MaxSubarraySum {
    public static int maxSubarraySum(int[] nums) {
        int currentMax = nums[0];
        int globalMax = nums[0];
        for (int i = 1; i < nums.length; i++) {

            // Выбираем между началом новой подпоследовательности или продолжением текущей
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            
            // Обновляем глобальную максимальную сумму, если текущая больше
            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -6, 9, -1, 3};
        int maxSum = maxSubarraySum(nums);
        System.out.println("Максимальная сумма подмассива: " + maxSum);
    }
}