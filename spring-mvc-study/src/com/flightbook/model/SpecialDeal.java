package com.flightbook.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.util.Assert;

public class SpecialDeal {

	private Airport departFrom;
	
	private Airport arriveAt;
	
	private BigDecimal cost;
	
	private Date beginOn;
	
	private Date endOn;
	
	public SpecialDeal(Airport departFrom, Airport arriveAt, BigDecimal cost, Date beginOn, Date endOn){
		this.departFrom = departFrom;
		this.arriveAt = arriveAt;
		this.cost = cost;
		this.beginOn = new Date(beginOn.getTime());
		this.endOn = new Date(endOn.getTime());
	}

	public Airport getDepartFrom() {
		return departFrom;
	}

	public Airport getArriveAt() {
		return arriveAt;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public boolean IsValidNow(){
		return IsValidOn(new Date());
	}
	
	public boolean IsValidOn(Date date){
		Assert.notNull(date, "Date must not Null");
		Date dateCopy = new Date(date.getTime());
		return ((dateCopy.equals(beginOn) || dateCopy.after(beginOn)) &&
				(dateCopy.equals(endOn) || dateCopy.before(endOn)));
	}
}
