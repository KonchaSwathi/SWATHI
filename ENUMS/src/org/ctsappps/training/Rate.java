package org.ctsappps.training;

public class Rate {
	
	 public static void main(String[] args)
	 {
		Theater silver =Theater.SILVER;
		Theater gold=Theater.GOLD;
		Theater platinum=Theater.PLATINUM;
		System.out.println("the cost of silver is"+Theater.SILVER.getRate());
		System.out.println("the cost of gold is"+Theater.GOLD.getRate());
		System.out.println("the cost of platinum is"+Theater.PLATINUM.getRate());
	 }

}
	
