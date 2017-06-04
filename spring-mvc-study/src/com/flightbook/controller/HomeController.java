package com.flightbook.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.flightbook.service.FlightService;

public class HomeController extends AbstractController {
	
	private static final int FIVE_MINUTES = 5 * 60;
	private FlightService flightService;
	
	public HomeController() {
		setSupportedMethods(new String[]{METHOD_GET});
		setCacheSeconds(FIVE_MINUTES);
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("specials", flightService.getSpecialDeals());
		return mv;
	}

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}

}
