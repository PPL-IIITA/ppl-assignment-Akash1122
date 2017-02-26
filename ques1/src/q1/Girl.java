
package q1;


public class Girl
{
	private int attractiveness;
	private int intelligence;
	private double maintenance_cost;
	private double happiness;
	private boolean commited;
	private String name;
	private String type;
	public Girl(String Name, String Type, int attr, int intelli, double m)
	{
		name = Name;
		type = Type;
		attractiveness = attr;
		intelligence = intelli;
		maintenance_cost = m;
		commited = false;
		happiness = 0;
	}

    Girl(String na, String normal, int i, int i0, int i1) {
         
    }
	public final int getAttractiveness()
	{
		return attractiveness;
	}
	public final int getIntelligence()
	{
		return intelligence;
	}
	public final double getMaintenanceCost()
	{
		return maintenance_cost;
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
		return name;
	}
	public final String getType()
	{
			return type;
	}
	public final void setRelationshipStatus(boolean x)
	{
		commited = x;
	}
	public final void setData(String naam_g, String commit_g, int att_g, int int_g, double budget_g)
	{
		name = naam_g;
		type = commit_g;
		attractiveness = att_g;
		intelligence = int_g;
		maintenance_cost = budget_g;
	}
}

