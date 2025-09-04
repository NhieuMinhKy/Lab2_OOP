/**
 * @description CourseList.java
 * @author     NhieuMinhKy
 * @version    1.0
 * @created    Sep 4, 2025 2:04 PM
 */
package iuh_fit_cs;
/**
 * Lớp quản lý danh sách các khóa học.
 */
public class CourseList {
	 private Course[] courses;
	    private int count;
	 
//constructor
	 public CourseList(int size) {
		 courses =new Course[size];
		 count =0;
	 }
	 
//property get
	 public Course[] getCourses() {
		 return courses;
	 }

	 public int getCount() {
		 return count;
	 }
	 
//addCourse	 
	 public boolean addCourse(Course a) {
		 if(count>=courses.length) return false;
		 if(exist(a)) return false;
		 courses[count++]=a;
		 return true;
	 }
	 
//existCourse
	 private boolean exist(Course a) {
		 for(int i=0;i<count;i++) {
			 if(courses[i].getId().equals(a.getId()))
				 return true;
		 }
		 return false;
	 }

//findDepartmentWithMostCourse
	 public String findDepartmentWithMostCourse() {
		 if (count == 0) return null;

		    String maxDept = null;
		    int maxCount = 0;

		    for (int i = 0; i < count; i++) {
		        String dept = courses[i].getDepartment();

		        // Kiểm tra khoa này đã được tính trước đó chưa
		        boolean alreadyCounted = false;
		        for (int k = 0; k < i; k++) {
		            if (courses[k].getDepartment().equalsIgnoreCase(dept)) {
		                alreadyCounted = true;
		                break;
		            }
		        }
		        if (alreadyCounted) continue; // bỏ qua khoa đã tính

		        // Đếm số khóa học của khoa hiện tại
		        int cnt = 0;
		        for (int j = 0; j < count; j++) {
		            if (courses[j].getDepartment().equalsIgnoreCase(dept)) {
		                cnt++;
		            }
		        }

		        // Cập nhật nếu nhiều hơn max
		        if (cnt > maxCount) {
		            maxCount = cnt;
		            maxDept = dept;
		        }
		    }

		    return maxDept;
		}
	 
//findMaxCreditCourse
	 public Course findMaxCreditCourse() {
	        if (count == 0) return null;
	        Course max = courses[0];
	        for (int i = 1; i < count; i++) {
	            if (courses[i].getCredit() > max.getCredit()) max = courses[i];
	        }
	        return max;
	    }

//removeCourse	 
	 public boolean removeCourse(String id) {
		 for(int i=0;i<count;i++) {
			 if(courses[i].getId().equals(id)) {
				 courses[i]=courses[count-1];
				 courses[count-1]=null;
				 count--;
				 return true;
			 }
		 }
		 return false;
	 }
//searchCourse
	 //tự cho search title
	 public Course[] searchCourse(String a) {
		int n=0;
		Course[] result=new Course[count];
		for(int i=0;i<count;i++) {
			if(courses[i].getTitle().toLowerCase().contains(a.toLowerCase())) {
				result[n++]=courses[i];
			}
		}
		Course[] rs=new Course[n];
		System.arraycopy(result, 0, rs, 0, n);
		return rs;	
	}

//searchCourseByDepartment
	public Course[] searchCourseByDepartment(String a) {
		int n=0;
		Course[] result=new Course[count];
		for(int i=0;i<count;i++) {
			if(courses[i].getDepartment().equalsIgnoreCase(a)) {
				result[n++]=courses[i];
			}
		}
		Course[] rs=new Course[n];
		System.arraycopy(result, 0, rs, 0, n);
		return rs;	
	}	
	
//searchCourseById
	public Course searchCourseById(String a) {
		for(int i=0;i<count;i++) {
			if(courses[i].getId().toLowerCase().equals(a.toLowerCase()))
				return courses[i];
		}
		return null;
	}
	
//sortCourse
	//tự cho sort theo title
	public Course[] sortCourse() {
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if(courses[i].getTitle().compareToIgnoreCase(courses[j].getTitle())>0) {
					Course tmp = courses[i];
					courses[i] = courses[j];
					courses[j] = tmp;
				}
			}
		}
		return courses;
	}
}

 
