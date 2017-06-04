package com.flightbook.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.flightbook.model.Airport;
import com.flightbook.model.Flight;
import com.flightbook.model.FlightLeg;
import com.flightbook.model.FlightSearchCriteria;
import com.flightbook.model.SpecialDeal;
import com.flightbook.service.FlightService;

public class FlightServiceImpl implements FlightService {
	
	private List<Flight> flights;
	
	private List<SpecialDeal> spDeals;
	
	public FlightServiceImpl(){
		Airport SHAir = new Airport("shanghai", "hk112");
		Airport SingaporeAir = new Airport("Singapore", "hk102");
		Airport ThailandAir = new Airport("Thailand", "hk103");
		Airport koreaAir = new Airport("Korea", "hk196");
		Airport JapanAir = new Airport("Japan", "hk211");
		
		List<FlightLeg> flightlegs1 = new ArrayList<FlightLeg>();
		FlightLeg leg1 = new FlightLeg(SHAir, new Date(), SingaporeAir, new Date());
		FlightLeg leg2 = new FlightLeg(SingaporeAir, new Date(), ThailandAir, new Date());
		flightlegs1.add(leg1);
		flightlegs1.add(leg2);
		
		List<FlightLeg> flightlegs2 = new ArrayList<FlightLeg>();
		FlightLeg leg3 = new FlightLeg(SHAir, new Date(), koreaAir, new Date());
		FlightLeg leg4 = new FlightLeg(koreaAir, new Date(), JapanAir, new Date());
		flightlegs2.add(leg3);
		flightlegs2.add(leg4);
		
		BigDecimal cost1 = new BigDecimal(5000.0);
		Flight flight1 = new Flight(flightlegs1, cost1);
		
		BigDecimal cost2 = new BigDecimal(3000.0);
		Flight flight2 = new Flight(flightlegs2, cost2);
		
		flights = new ArrayList<Flight>();
		flights.add(flight1);
		flights.add(flight2);
	}
	
	@Override
	public List<SpecialDeal> getSpecialDeals() {
		if ((spDeals == null) || (spDeals.size() == 0)){
			Airport SHAir = new Airport("shanghai", "hk112");
			Airport HKAir = new Airport("hongkong", "hk268");
			Airport BJAir = new Airport("beijing", "hk116");
			Airport GZAir = new Airport("guangzhou", "hk111");
			BigDecimal cost1 = new BigDecimal(1000.0);
			SpecialDeal spDeal1 = new SpecialDeal(SHAir, HKAir, cost1, 
					new Date(), new Date());
			BigDecimal cost2 = new BigDecimal(1500.0);
			SpecialDeal spDeal2 = new SpecialDeal(BJAir, GZAir, cost2, 
					new Date(), new Date());
			List<SpecialDeal> spDeals = new ArrayList<SpecialDeal>();
			spDeals.add(spDeal1);
			spDeals.add(spDeal2);
		}
		return spDeals;
	}

	@Override
	public List<Flight> findFlights(FlightSearchCriteria search) {
//		List<Flight> rs = new ArrayList<Flight>();
//		for (int i = 0; i < flights.size(); i++) {
//			if ((search.getDepartFrom() != null) && (!search.getDepartFrom().equals(""))){
//				if (flights.get(i).getDepartFrom().getName().indexOf(search.getDepartFrom()) >= 0){
//					rs.add(flights.get(i));
//				}
//			}
//			if ((search.getArriveAt() != null) && (!search.getArriveAt().equals(""))){
//				if (flights.get(i).getArriveAt().getName().indexOf(search.getArriveAt()) >= 0){
//					rs.add(flights.get(i));
//				}
//			}
//			if (search.getDepartOn() != null){
//				if (flights.get(i).getFirstLeg().getDepartOn().after(search.getDepartOn())){
//					rs.add(flights.get(i));
//				}
//			}
//			if (search.getReturnOn() != null){
//				if (flights.get(i).getLastLeg().getArriveOn().before(search.getReturnOn())){
//					rs.add(flights.get(i));
//				}
//			}
//		}
//		return rs;
		return flights;
	}

}
