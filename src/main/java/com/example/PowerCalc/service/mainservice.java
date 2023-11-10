package com.example.PowerCalc.service;

import org.springframework.stereotype.Service;

@Service
public class mainservice {
	
	public double lt1a(double time,double power)
	{
		double energy_consumption=(power/1000)*time;
		double total_cost=energy_consumption*3.35;
		return total_cost;
	}
	public double lt4a(double time,double power,double connected_load)
	{
		if(connected_load<=20 && connected_load>0)
		{
			double energy_consumption=(power/1000)*time;
			double total_cost=energy_consumption*5.80;
			return total_cost;	
		}
		else if(connected_load>20)
		{
			double energy_consumption=(power/1000)*time;
			double total_cost=energy_consumption*5.85;
			return total_cost;	
		}
		return 0;
		
	}
	public double lt4b(double time,double power,double connected_load)
	{
		if(connected_load<=20 && connected_load>0)
		{
			double energy_consumption=(power/1000)*time;
			double total_cost=energy_consumption*6.50;
			return total_cost;	
		}
		else if(connected_load>20)
		{
			double energy_consumption=(power/1000)*time;
			double total_cost=energy_consumption*6.60;
			return total_cost;	
		}
		return 0;
		
	}
	public double lt5a(double time,double power)
	{
		double energy_consumption=(power/1000)*time;
		double total_cost=energy_consumption*2.30;
		return total_cost;
	}
	public double lt5b(double time,double power)
	{
		double energy_consumption=(power/1000)*time;
		double total_cost=energy_consumption*3.30;
		return total_cost;
	}
	public double lt6a(double time,double power,double connected_load)
	{
		if(connected_load<=500 && connected_load>0)
		{
			double energy_consumption=(power/1000)*time;
			double total_cost=energy_consumption*5.8;
			return total_cost;	
		}
		else if(connected_load>500)
		{
			double energy_consumption=(power/1000)*time;
			double total_cost=energy_consumption*6.65;
			return total_cost;	
		}
		return 0;
		
	}
	public double lt6b(double time,double power,double connected_load)
	{
		if(connected_load<=500 && connected_load>0)
		{
			double energy_consumption=(power/1000)*time;
			double total_cost=energy_consumption*6.50;
			return total_cost;	
		}
		else if(connected_load>500)
		{
			double energy_consumption=(power/1000)*time;
			double total_cost=energy_consumption*6.60;
			return total_cost;	
		}
		return 0;
	}
	public double lt6c(double time,double power,double connected_load)
	{
		if(connected_load<=500 && connected_load>0)
		{
			double energy_consumption=(power/1000)*time;
			double total_cost=energy_consumption*7.15;
			return total_cost;	
		}
		else if(connected_load>500)
		{
			double energy_consumption=(power/1000)*time;
			double total_cost=energy_consumption*8.65;
			return total_cost;	
		}
		return 0;
	}
	public double lt6d(double time,double power)
	{
		double energy_consumption=(power/1000)*time;
		double total_cost=energy_consumption*2.10;
		return total_cost;
	}
	public double lt6e(double time,double power)
	{
		double energy_consumption=(power/1000)*time;
		double total_cost=energy_consumption*3.65;
		return total_cost;
	}
	public double lt6f(double time,double power)
	{
		double energy_consumption=(power/1000)*time;
		double total_cost=energy_consumption*6.0;
		return total_cost;
	}
	public double lt6g(double time,double power)
	{
		double energy_consumption=(power/1000)*time;
		double total_cost=energy_consumption*5.85;
		return total_cost;
	}
	public double lt7a(double time,double power)
	{
		double energy_consumption=(power/1000)*time;
		double total_cost=energy_consumption*6.05;
		return total_cost;
	}
	public double lt7b(double time,double power)
	{
		double energy_consumption=(power/1000)*time;
		double total_cost=energy_consumption*5.3;
		return total_cost;
	}
	public double lt7c(double time,double power)
	{
		double energy_consumption=(power/1000)*time;
		double total_cost=energy_consumption*6.3;
		return total_cost;
	}
	
	
	

}
