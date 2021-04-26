package day2;

public class Main
{

	public static void main(String[] args)
	{
		Course course1 = new Course(1, "C# + Angular", "C# + Angular e�itim kamp�.");
		Course course2 = new Course(2, "Java + React", "Java + React e�itim kamp�.");
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlamaya giri� i�in temel kurs";
		course3.description = "Temel programlama mant��� anlat�lmaktad�r.";

		Course[] courses =
		{ course1, course2, course3 };

		Teacher teacher1 = new Teacher(1, "Engin Demiro�");

		Teacher[] teachers =
		{ teacher1 };

		for (Course course : courses)
		{
			System.out.println(course.name + " / " + course.description);
		}

		for (Teacher teacher : teachers)
		{
			System.out.println("E�itmen: " + teacher.name);
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
