package tiil.edu;
import java.util.Scanner;
public class Lab1_Bai4_Delta {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hệ số của phương trình bậc 2
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        // Tính delta
        double delta = b * b - 4 * a * c;
        double canDelta = Math.sqrt(Math.abs(delta));
        
        // Xuất kết quả
        System.out.println("\nGiá trị delta: " + delta);
        System.out.println("Căn delta: " + canDelta);
        
        scanner.close();
    }
}
