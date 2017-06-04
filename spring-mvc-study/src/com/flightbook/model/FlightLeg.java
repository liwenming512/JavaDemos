package com.flightbook.model;

import java.util.Date;

public class FlightLeg {

	private Airport departFrom;
	
	private Date departOn;
	
	private Airport arriveAt;
	
	private Date arriveOn;

	public Airport getDepartFrom() {
		return departFrom;
	}

	public Date getDepartOn() {
		return departOn;
	}

	public Airport getArriveAt() {
		return arriveAt;
	}

	public Date getArriveOn() {
		return arriveOn;
	}
	
	public FlightLeg(Airport departFrom, Date date, Airport arriveAt, Date date2){
		this.departFrom = departFrom;
		this.departOn = date;
		this.arriveAt = arriveAt;
		this.arriveOn = date2;
	}
}
