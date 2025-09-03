/**
 * @description Test tính chu vi diện tích hình chữ nhật
 * @author Minh Ky
 * @version 1.0
 * @created 4-Sep-2025 1:09 AM
 */
package iuh.fit.CS;

import java.util.Scanner;
/**
 * Lớp kiểm thử cho Rectangle.
 */
public class TestRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("width: ");
		double width=sc.nextDouble();
		System.out.println("Length: ");
		double length=sc.nextDouble();
		Rectangle rec=new Rectangle(width,length);
		System.out.println("Chu vi:"+rec.calcPerimeter()+", Dien tich:"+rec.calcArea());
		String headerline = String.format("%s\t%s\t%s\t%s","width","length","area","perimeter");
		System.out.println(headerline);
		System.out.println(rec);
	}
}
