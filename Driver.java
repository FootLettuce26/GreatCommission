package greatCommission;

public class Driver
{
	public static void main(String[] args) {
		int initialYears = 0;
		long initialDisciples = 13;
		int newMultiplier = 3;

		//how many years?
		System.out.println("It takes " + Commission(initialDisciples, initialYears, newMultiplier) + " years to complete the mission.");
		//what if we want to make it in 50 years
		
		System.out.println("If we wanted to complete the mission in under 50 years, " + DisciplesTrain(initialDisciples, initialYears, newMultiplier) + " disciples need to be trained per person.");
		
	}
	
	public static int Commission(long disciples, int newYears, int multiplier)
	{
	    long population = 7700000000L;

        
	    while(disciples < population)
	    {
	    	 newYears = newYears + 3;
	         disciples = disciples*multiplier;
	         //System.out.println(disciples);
	    }
	    
        return newYears;
	}
	
	public static int DisciplesTrain(long disciples, int years, int multiplier)
	{
		
		if(Commission(disciples, years, multiplier) > 50)
		{
			multiplier = multiplier + 1;
			DisciplesTrain(disciples, years, multiplier);
		}
		multiplier = multiplier - 1;
		
		return multiplier;
		//System.out.println(Years);
	}
}

