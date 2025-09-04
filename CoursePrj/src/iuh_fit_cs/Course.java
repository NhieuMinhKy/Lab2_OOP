/**
 * @description Course.java
 * @author     NhieuMinhKy
 * @version    1.0
 * @created    Sep 4, 2025 1:31 PM
 */
package iuh_fit_cs;
/**
 * Lớp mô tả thông tin của một Khóa học.
 * Mỗi khóa học có mã, tên, số tín chỉ và khoa phụ trách.
 */
public class Course {
	private int credit;
	private String department;
	private String id;
	private String title;
	
	//Constructor
	public Course() {}
	public Course(int credit,String department,String id,String title) {
		this.credit =credit;
		this.department=department;
		this.id=id;
		this.title=title;
	}
	
	//Property get
	public int getCredit() {
		return credit;
	}
	public String getDepartment() {
		return department;
	}
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	
	//Property set
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	@Override
	public String toString() {
		return String.format("Course[id= %s, title= %s, credit= %d, department= %s]",
				id,title,credit,department);
	}
}
