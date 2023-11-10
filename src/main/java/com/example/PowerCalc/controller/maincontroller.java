package com.example.PowerCalc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.PowerCalc.service.mainservice;

@Controller
public class maincontroller {
	@Autowired
	mainservice service;
	
	@RequestMapping("/powercalc")
	public String main()
	{
		return "index";
	}
	@GetMapping("/result")
	public String Total(Model m)
	{
		Double time=(Double) m.getAttribute("time");
		Double power=(Double) m.getAttribute("power");
		Double total_cost=(Double) m.getAttribute("total");
		m.addAttribute("time", time);
		m.addAttribute("power", power);
		m.addAttribute("total", total_cost);
		return "index";
	}
	@PostMapping("/value")
	public String values(RedirectAttributes redirect ,@RequestParam("tarif") String tarif,@RequestParam("power") double power,@RequestParam("time") double time,@RequestParam(value="load",required = false) Double load )
	{
		redirect.addFlashAttribute("power", power);
		redirect.addFlashAttribute("time",time );
		
		if(tarif.equals("LT-1A"))
		{
			double total_cost=service.lt1a(time, power);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-4A"))
		{
			double total_cost=service.lt4a(time, power, load);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-4B"))
		{
			double total_cost=service.lt4b(time, power, load);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-5A"))
		{
			double total_cost=service.lt5a(time, power);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-5B"))
		{
			double total_cost=service.lt5b(time, power);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-6A"))
		{
			double total_cost=service.lt6a(time, power, load);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-6B"))
		{
			double total_cost=service.lt6b(time, power, load);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-6C"))
		{
			double total_cost=service.lt6c(time, power, load);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-6D"))
		{
			double total_cost=service.lt6d(time, power);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-6E"))
		{
			double total_cost=service.lt6e(time, power);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-6F"))
		{
			double total_cost=service.lt6f(time, power);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-6G"))
		{
			double total_cost=service.lt6g(time, power);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-7A"))
		{
			double total_cost=service.lt7a(time, power);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-7B"))
		{
			double total_cost=service.lt7b(time, power);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		else if(tarif.equals("LT-7C"))
		{
			double total_cost=service.lt7c(time, power);
			redirect.addFlashAttribute("total", total_cost);
			return "redirect:/result";
		}
		return "redirect:/result";
	}

}
