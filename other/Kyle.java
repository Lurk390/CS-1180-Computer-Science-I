package other;
public class Kyle {
    public static void main(String[] args) {
        int[][] grid = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 0, 4 } };
        // int[][] grid = new int[2][3];
        getPosition(grid);

        for (int i = 0; i < grid.length; i++) {
            System.out.println();
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]);
            }
        }
    }

    public static int getPosition(int[][] grid) {
        // int i = 0;
        // int j = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    System.out.print(i + ",");
                    System.out.println(j);
                }
            }
        }
        return 0;
    }

}
