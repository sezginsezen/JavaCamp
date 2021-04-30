package day3;

public class InstructorManager
{
	public void getInstructorDetails(Instructor instructor)
	{
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getInstructorNumber() + " " + instructor.getEmail());
	}
}
