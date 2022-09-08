package myTimeHours;

public class getTime {
	
     
	public long GetSS()
	{   long timeMillesecunts = System.currentTimeMillis();
		long timeSeconds = timeMillesecunts / 1000;
		return timeSeconds;
	}
	
	public long GetMM()
	{   GetSS();
		long timeMinutes = GetSS() / 60;
		return timeMinutes;
	}
	
	public long GetHH()
	{
		long totalHour = GetMM() /60;
		return totalHour;
	}
	
	
	public void print()
	{   
		long secondAtual = GetSS() % 60;
		long minutesAtual = GetMM() % 60;
		long timeHourAtual = GetHH() % 24;
		System.out.println(timeHourAtual-3+":"+minutesAtual+":"+secondAtual);
		long minAtual = minutesAtual;
		
		while(true)
		{
			 secondAtual = GetSS() % 60;
			 minutesAtual = GetMM() % 60;
			 timeHourAtual = GetHH() % 24;
			 
			 
			if(minAtual!=minutesAtual)
			{
				System.out.println(timeHourAtual-3+":"+minutesAtual+":"+secondAtual);
			}
			
		    minAtual = minutesAtual;
		}
		
		
		
		
	
	}
	

}
