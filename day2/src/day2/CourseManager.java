package day2;

public class CourseManager
{
	public void joinCourse(Course course)
	{
		System.out.println(course.name + " kursuna kat�ld�n�z.");
	}

	public void courseDetails(Course course)
	{
		System.out.println("Kurs ad�: " + course.name + " / A��klama: " + course.description);
	}
}
