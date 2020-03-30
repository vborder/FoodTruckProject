package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String name; // class fields
	private String foodType;
	private int rating;
	private static int nextTruckID = 0;
	private int numericId;
	
	public FoodTruck(String name, String foodType, int rating) {
		this();
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}
	
	public FoodTruck() {
		nextTruckID++;
		this.numericId = nextTruckID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFoodType() {
		return foodType;
	}
	
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public int getNumericId() {
		return numericId;
	}

	public void setNumericId(int numericId) {
		this.numericId = numericId;
	}

	public String toString() {
	    String output = "Name: " + name + ", Type of food: " + foodType + ", Rating: " + rating + ", ID#: " + numericId;
	    return output;
	}
}