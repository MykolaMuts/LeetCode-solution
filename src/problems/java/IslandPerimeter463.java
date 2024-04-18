package problems.java;

public class IslandPerimeter463 {

    public int islandPerimeter(int[][] grid) {

        int perimeter = 0;

        int height = grid.length;
        int width = grid[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 1) {

                    perimeter += 4;

                    if (i > 0) {
                        if (grid[i - 1][j] == 1) { // above
                            perimeter -= 2;
                        }
                    }

                    if (j > 0) {
                        if (grid[i][j - 1] == 1) { // left
                            perimeter -= 2;
                        }
                    }
                }
            }
        }

        return perimeter;
    }

    public static void test() {
        IslandPerimeter463 solution = new IslandPerimeter463();
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};

        System.out.println(solution.islandPerimeter(grid));

    }
}
