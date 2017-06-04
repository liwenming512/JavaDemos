package com.flightbook.service;

import java.util.List;

import com.flightbook.model.Flight;
import com.flightbook.model.FlightSearchCriteria;
import com.flightbook.model.SpecialDeal;

public interface FlightService {

	List<SpecialDeal> getSpecialDeals();
	
	List<Flight> findFlights(FlightSearchCriteria search);
}
