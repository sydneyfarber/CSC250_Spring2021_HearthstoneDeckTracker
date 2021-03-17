
public class Driver 
{

	public static void main(String[] args) 
	{
		HearthstoneCard c1 = new HearthstoneCard ("Girl1", 17, 12, 15);
		HearthstoneCard c2 = new HearthstoneCard ("Girl2", 18, 12, 34);
		c1.display();
		c2.display();

		c1.setName("Emily");
		c1.display();
		
	}

}
