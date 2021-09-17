package com.brs.service;

import java.time.LocalDate;
import java.util.List;
import com.brs.entity.Route;

public interface IRouteService {
	public Route addRoute(Route route);
	public Route updateRoute(Route route);
	public Route viewRoute(int routeid);
	public Route deleteRoute(int routeid);
	public List<Route> viewAllRoute();
	public List<Route> getAllRoute(LocalDate date);
}