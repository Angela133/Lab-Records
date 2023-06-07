import java.util.Scanner;
public class SymmetricMatrix {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of rows and columns of the matrix: ");
int n = input.nextInt();
int[][] matrix = new int[n][n];
System.out.println("Enter the elements of the matrix:");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
matrix[i][j] = input.nextInt();
}
}
boolean symmetric = true;
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
if (matrix[i][j] != matrix[j][i]) {
symmetric = false;
break;
}
}
if (!symmetric) {
break;
}
}
if (symmetric) {
System.out.println("The matrix is symmetric.");
} else {
System.out.println("The matrix is not symmetric.");
}
input.close();
}
}
