package com.flightbook.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.util.Assert;

public class Flight {
	
	private List<FlightLeg> legs;
	
	private BigDecimal totalCost;
	
	public Flight(List<FlightLeg> legs, BigDecimal totalCost){
		Assert.notNull(legs);
		Assert.isTrue(legs.size() >= 1, "Flight must have legs");
		this.legs = legs;
		this.totalCost = totalCost;
	}

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public boolean IsNonStop(){
		return legs.size() == 1;
	}
	
	public Airport getDepartFrom(){
		return getFirstLeg().getDepartFrom();
	}
	
	public Airport getArriveAt(){
		return getLastLeg().getArriveAt();
	}
	
	public FlightLeg getFirstLeg(){
		return legs.get(0);
	}
	
	public FlightLeg getLastLeg(){
		return legs.get(legs.size() - 1);
	}
	
	public int getNumberOfLegs(){
		return legs.size();
	}
	
	public long getTotalTravelTime(){
		Date start = getFirstLeg().getDepartOn();
		Date end = getLastLeg().getArriveOn();
//		Assert.isTrue(end.compareTo(start) > 0, "start date must before end date");
		return (end.getTime() - start.getTime());
	}
}
