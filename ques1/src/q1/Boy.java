
package q1;


public class Boy
{
	private int attractiveness;
	private int intelligence;
	private double budget;
	private double happiness;
	private boolean commited;
	private String Name;
	private String type;
	private int minAttraction;
        
	 Boy(String name, String Type, int attr, int intelli, double bud)
	{
		Name = name;
		type = Type;
		attractiveness = attr;
		intelligence = intelli;
		budget = bud;
		commited = false;
		happiness = 0;
	}

    Boy(String na, String geek, int i, int i0, int i1) {
        
    }
        
	public final int getAttractiveness()
	{
		return attractiveness;
	}
	public final int getIntelligence()
	{
		return intelligence;
	}
	public final double getBudget()
	{
		return budget;
	}
	public final double getHappiness()
	{
		return happiness;
	}
	public final String getRelationshipStatus()
	{
		if (commited)
		{
			return "Commited";
		}
		else
		{
			return "Single";
		}
	}
	public final String getName()
	{
		return Name;
	}
	public final String getType()
	{
			return type;
	}
	public final void setRelationshipStatus(boolean x)
	{
		commited = x;
	}
	public final int getMinAttraction()
	{
		return minAttraction;
	}
	public final void setData(String naam_b, String commit_b, int att_b, int int_b, double budget_b)
	{
		Name = naam_b;
		type = commit_b;
		attractiveness = att_b;
		intelligence = int_b;
		budget = budget_b;
	}
}
