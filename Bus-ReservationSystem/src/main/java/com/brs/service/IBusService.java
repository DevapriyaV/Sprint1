package com.brs.service;

import java.util.List;

import com.brs.entity.Bus;

public interface IBusService {
	public Bus addBus(Bus bus);
	public Bus updateBus(Bus bus);
	public Bus deleteBus(int busId);
    public Bus viewBus(int busId);
    public List<Bus> viewBusByType(String busType);
    public List<Bus> viewAllBus();
}