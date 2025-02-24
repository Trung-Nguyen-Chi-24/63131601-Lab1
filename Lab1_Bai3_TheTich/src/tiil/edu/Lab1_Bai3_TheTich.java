package tiil.edu;
import java.util.Scanner;
public class Lab1_Bai3_TheTich {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập cạnh của khối lập phương
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        
        // Tính thể tích
        double theTich = Math.pow(canh, 3);
        
        // Xuất kết quả
        System.out.println("\nThể tích của khối lập phương: " + theTich);
        
        scanner.close();
    }

}
