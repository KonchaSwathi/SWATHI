package org.ctsappps.training;

public enum Theater {
	SILVER,
	GOLD,
	PLATINUM;
public int getRate()
 {
	if(this==SILVER)
	{
		return 130;
	}
	else if(this==GOLD)
	{
		return 200;
	}
	else
	{
		return 100;
	}
	
 }
	 
	
}



