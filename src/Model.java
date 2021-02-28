import java.util.*;

public class Model 
{
	public List<String> getTypes(String type)
	{
		List<String> list = new ArrayList<String>();
		
		if(type.equals("icecream"))
		{
			list.add("Vanila");
			list.add("Butter-Scotch");
		}
		else if(type.equals("softdrink"))
		{
			list.add("Pepsi");
			list.add("Slice");
			list.add("Limca");
			list.add("Coca-Cola");
		}
		else if(type.equals("chocolate"))
		{
			list.add("Cadbury");
			list.add("KitKate");
			list.add("Munch");
		}
		else if(type.equals("sweets"))
		{
			list.add("Kaju Katli");
			list.add("Jalebi");
			list.add("Barfii");
		}
		else
		{
			list.add("Shop is Close !!");
		}
		return list;
		
	}
	
	

}
