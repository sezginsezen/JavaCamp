package day2;

public class CourseManager
{
	public void joinCourse(Course course)
	{
		System.out.println(course.name + " kursuna katıldınız.");
	}

	public void courseDetails(Course course)
	{
		System.out.println("Kurs adı: " + course.name + " / Açıklama: " + course.description);
	}
}
