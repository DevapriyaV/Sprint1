package com.brs.service;

import java.util.List;

import com.brs.entity.Route;

public interface IRouteService {
	public Route addRoute(Route route);
	public Route updateRoute(Route route);
	public Route deleteRoute(int routeid);
	public Route viewRoute(int routeid);
	public List<Route> viewAllRoute();

}
