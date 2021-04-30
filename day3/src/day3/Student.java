package day3;

public class Student extends User
{
	private String studentNumber;
	private String adress;
	
	public Student()
	{
		
	}
	
	public Student(String studentNumber, String adress)
	{
		super();
		this.studentNumber = studentNumber;
		this.adress = adress;
	}

	public String getStudentNumber()
	{
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber)
	{
		this.studentNumber = studentNumber;
	}

	public String getAdress()
	{
		return adress;
	}

	public void setAdress(String adress)
	{
		this.adress = adress;
	}
}
