import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayRow, arrayColumn;
        int evenSum = 0, oddSum = 0;
        System.out.print("Nhập số hàng của mảng: ");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập số nguyên hợp lệ: ");
                scanner.next();
                continue;
            }

            arrayRow = scanner.nextInt();

            if (arrayRow <= 0) {
                System.out.print("Vui lòng nhập số nguyên dương: ");
                continue;
            }
            break;
        }

        System.out.print("Nhập số cột của mảng: ");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập số nguyên hợp lệ: ");
                scanner.next();
                continue;
            }

            arrayColumn = scanner.nextInt();

            if (arrayColumn <= 0) {
                System.out.print("Vui lòng nhập số nguyên dương: ");
                continue;
            }
            break;
        }
        int [][] matrix = new int[arrayRow][arrayColumn];
        for (int i = 0; i < arrayRow; i++) {
            for (int j = 0; j < arrayColumn; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: ");
                while (true) {
                    if (!scanner.hasNextInt()) {
                        System.out.println("Vui lòng nhập số nguyên : ");
                        scanner.next();
                        continue;
                    }
                    matrix[i][j] = scanner.nextInt();
                    break;
                }
            }
        }
        for (int i = 0; i < arrayRow; i++) {
            for (int j = 0; j < arrayColumn; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenSum += matrix[i][j];
                }else {
                    oddSum += matrix[i][j];
                }
            }
        }
        System.out.println("Tổng các số chẵn trong mảng là: " + evenSum);
        System.out.println("Tổng các số lẻ trong mảng là: " + oddSum);
        scanner.close();
    }
}