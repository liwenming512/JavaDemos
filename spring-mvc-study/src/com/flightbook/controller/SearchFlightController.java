package com.flightbook.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.flightbook.model.FlightSearchCriteria;
import com.flightbook.service.FlightService;

public class SearchFlightController extends SimpleFormController {
	
	private FlightService flightService;
	
	public SearchFlightController (){
		setCommandName("flightSearchCriteria");
		setCommandClass(FlightSearchCriteria.class);
		setFormView("beginSearch");
		setSuccessView("listFlights");
	}

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
	
	@Override
	protected void initBinder(HttpServletRequest req, ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH"), true));
	}
	
	@Override
	protected ModelAndView onSubmit(Object command){
		FlightSearchCriteria search = (FlightSearchCriteria) command;
		ModelAndView mv = new ModelAndView(getSuccessView());
		mv.addObject("flights", flightService.findFlights(search));
		mv.addObject("flightSearchCriteria", search);
		return mv;
	}
}
