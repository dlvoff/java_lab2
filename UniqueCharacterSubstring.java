public class UniqueCharacterSubstring {
    public static String getUniqueCharacterSubstring(String input) {
        int n = input.length();
        if (n == 0) return "";

        // Массив для отслеживания символов
        boolean[] visited = new boolean[256]; // Предполагаем, что символы ASCII
        String longestSubstring = "";
        int left = 0;

        for (int right = 0; right < n; right++) {
            char currChar = input.charAt(right);

            // Если символ уже встречался, сдвигаем начальный индекс
            while (visited[currChar]) {
                visited[input.charAt(left)] = false;
                left++;
            }

            // Отмечаем текущий символ как встреченный
            visited[currChar] = true;

            // Проверяем, нужно ли обновить выходную подстроку
            if (longestSubstring.length() < right - left + 1) {
                longestSubstring = input.substring(left, right + 1);
            }
        }
        return longestSubstring;
    }

    public static void main(String[] args) {
        String input = "tervteshgu6yvdgdshyfbg34cadvghbfsdc";
        String result = getUniqueCharacterSubstring(input);
        System.out.println("Наибольшая подстрока без повторяющихся символов: " + result);
    }
}