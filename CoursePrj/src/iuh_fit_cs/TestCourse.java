/**
 * @description TestCourse.java
 * @author     NhieuMinhKy
 * @version    1.0
 * @created    Sep 4, 2025 2:55 PM
 */
package iuh_fit_cs;

/**
 * Lớp kiểm thử các chức năng của Course và CourseList.
 */
public class TestCourse {
	private static CourseList list;
	 private static void InitData() {
	        list = new CourseList(10);
	        list.addCourse(new Course(3, "IT", "C1", "Java Programming"));
	        list.addCourse(new Course(4, "IT", "C2", "Database Systems"));
	        list.addCourse(new Course(1, "Business", "C3", "Marketing Basics"));
	        list.addCourse(new Course(2, "Languages", "C4", "English Communication"));
	    }
	 
	 public static void main(String[] args) {
		 InitData();
		 System.out.println("Danh sách khóa học:");
		 for (int i = 0; i < list.getCount(); i++) 
	            System.out.println(list.getCourses()[i]);
		 
	     System.out.println("\nKhóa học tín chỉ cao nhất: " + list.findMaxCreditCourse());

	     System.out.println("\nTìm kiếm khóa học theo khoa IT:");
	     for (Course c : list.searchCourseByDepartment("IT")) 
	    	 System.out.println(c);
	            

	     System.out.println("\nTìm khóa học theo ID C03:");
	     System.out.println("\nDanh sách khóa học sau khi sắp xếp theo tên:");
	     list.sortCourse();
	     for (int i = 0; i < list.getCount(); i++) 
	    	 System.out.println(list.getCourses()[i]);
	            

	      System.out.println("\nKhoa có nhiều khóa học nhất: " + list.findDepartmentWithMostCourse());
	        
	}
}
