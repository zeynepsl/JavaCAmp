
public class StudentManager {
	public void Add(Student student) {
		System.out.println(student.email +  " email'e sahip ��renci eklendi");
	}
	
	public void Delete(Student student) {
		System.out.println(student.email +  " email'e sahip ��renci silindi");
	}
	
	public void Update(Student student) {
		System.out.println(student.email +  " email'e sahip ��renci g�ncellendi");
	}
}
