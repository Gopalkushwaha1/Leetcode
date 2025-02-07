import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballToColor = new HashMap<>();
        Map<Integer, Integer> colorFrequency = new HashMap<>();
        int[] result = new int[queries.length];
        int idx = 0;

        for (int[] q : queries) {
            int ball = q[0], color = q[1];

            // If the ball already has a color, update the frequency
            if (ballToColor.containsKey(ball)) {
                int prevColor = ballToColor.get(ball);
                colorFrequency.put(prevColor, colorFrequency.get(prevColor) - 1);
                if (colorFrequency.get(prevColor) == 0) {
                    colorFrequency.remove(prevColor); // Remove color if unused
                }
            }

            // Assign the new color
            ballToColor.put(ball, color);
            colorFrequency.put(color, colorFrequency.getOrDefault(color, 0) + 1);

            // Store the number of unique colors
            result[idx++] = colorFrequency.size();
        }

        return result;
    }
}
