import java.net.URL;
import java.util.Scanner;

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

		String cardJson = Driver.getJSON("https://api.hearthstonejson.com/v1/25770/enUS/cards.json");
		System.out.println(cardJson);
		//Let's make a json parser
		
		//Scanner input = new Scanner(System.in); 
		//System.out.print("Enter your age:");
		//String age = input.nextLine();
		//System.out.println(Integer.parseInt(age) + 2);
		
	}
	

	static String getJSON(String urlString) 
	{
		String line = "";
		try
		{
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			
			while (input.hasNext())
			{
				line += input.nextLine();
			}

			input.close();
		  
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			line = "Can't Connect";
		}
		return line;	
	}
		
}