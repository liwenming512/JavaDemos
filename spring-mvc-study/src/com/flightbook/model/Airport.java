package com.flightbook.model;

public class Airport {

	public String getName() {
		return name;
	}

	public String getAirportCode() {
		return airportCode;
	}

	private String name;
	
	private String airportCode;
	
	public Airport(String name, String airportCode){
		this.name = name;
		this.airportCode = airportCode;
	}
	
	public String toString(){
		return name + " (" + airportCode + ")"; 
	}
}
