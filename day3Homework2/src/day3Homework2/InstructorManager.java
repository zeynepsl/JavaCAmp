package day3Homework2;

public class InstructorManager extends BaseUserManager{
	public void addCourse(int id) {
		System.out.println(id + " numaral� kurs eklendi");
	}
	
	public void deleteCourse() {
		System.out.println("kurs silindi");
	}
	
	public void updateCourse() {
		System.out.println("kurs g�ncellendi");
	}
}
