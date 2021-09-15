package com.brs.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brs.entity.Bus;
import com.brs.service.IBusService;

@RestController
public class BusController {
	@Autowired
	private IBusService busservice;
	@PostMapping("addBus")
	public String addBus(@RequestBody Bus bus){
		int i=busservice.addBus(bus);
		String ss="could not create profile";
		if(i>0) {
			ss="profile created "+bus.getBusId();
		}
		return ss;
	}	
	
	@PostMapping("updatebus")
	public String updatebus(@ModelAttribute Bus bus) {
		busservice.updateBus(bus);
		return "updated";
	}
}
