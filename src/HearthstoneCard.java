
public class HearthstoneCard 
{
	private int age;
	private int grade;
	private int classrank;
	private String name; 
	
	public HearthstoneCard(String name, int age, int grade, int classrank) 
	{
		this.age = age;
		this.grade = grade;
		this.classrank = classrank;
		this.name = name;
	}
	
	public void setName(String name)
	{
		if(name.length() >= 5)
		{
			this.name = name; 
		}
		
	} 
	
	void display()
	{
		//System.out.println("Age:" + this.age + "\nGrade:" + this.grade + "\nClassrank:" + this.classrank);
		System.out.format("Name: %s\n Age: %d \nGrade: %d Classrank: %d\n", this.name, this.age, this.grade, this.classrank);
	
	}
}
