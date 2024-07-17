import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            int[][] matrix = new int[n][m];
            PriorityQueue<Cell> maxHeap = new PriorityQueue<>((a, b) -> b.value - a.value);
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                    maxHeap.add(new Cell(matrix[i][j], i, j));
                }
            }

            boolean[][] processed = new boolean[n][m];
            
            while (!maxHeap.isEmpty()) {
                Cell cell = maxHeap.poll();
                int i = cell.row;
                int j = cell.col;

                if (processed[i][j]) continue;

                if (isStrictlyGreater(matrix, i, j, n, m)) {
                    matrix[i][j]--;
                    maxHeap.add(new Cell(matrix[i][j], i, j));
                    processed[i][j] = true;
                }
            }
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
    
    private static boolean isStrictlyGreater(int[][] matrix, int i, int j, int n, int m) {
        int value = matrix[i][j];
        if (i > 0 && matrix[i - 1][j] >= value) return false;
        if (i < n - 1 && matrix[i + 1][j] >= value) return false;
        if (j > 0 && matrix[i][j - 1] >= value) return false;
        if (j < m - 1 && matrix[i][j + 1] >= value) return false;
        return true;
    }

    static class Cell {
        int value;
        int row;
        int col;

        Cell(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }
}
