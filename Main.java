import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] createdStar = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - j - 1 || i == (n - 1) / 2 || j == (n - 1) / 2) {
                    createdStar[i][j] = "*".charAt(0);
                } else {
                    createdStar[i][j] = ".".charAt(0);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(createdStar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
