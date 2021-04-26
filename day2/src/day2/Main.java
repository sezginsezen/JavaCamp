package day2;

public class Main
{

	public static void main(String[] args)
	{
		Course course1 = new Course(1, "C# + Angular", "C# + Angular eğitim kampı.");
		Course course2 = new Course(2, "Java + React", "Java + React eğitim kampı.");
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlamaya giriş için temel kurs";
		course3.description = "Temel programlama mantığı anlatılmaktadır.";

		Course[] courses =
		{ course1, course2, course3 };

		Teacher teacher1 = new Teacher(1, "Engin Demiroğ");

		Teacher[] teachers =
		{ teacher1 };

		for (Course course : courses)
		{
			System.out.println(course.name + " / " + course.description);
		}

		for (Teacher teacher : teachers)
		{
			System.out.println("Eğitmen: " + teacher.name);
		}

		CourseManager courseManager = new CourseManager();
		courseManager.joinCourse(course1);
		courseManager.joinCourse(course2);
		courseManager.joinCourse(course3);
		
		courseManager.courseDetails(course1);
		courseManager.courseDetails(course2);
		courseManager.courseDetails(course3);
	}

}
