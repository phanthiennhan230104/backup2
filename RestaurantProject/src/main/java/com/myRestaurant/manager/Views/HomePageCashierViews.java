package com.myRestaurant.manager.Views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/homepage-cashier")
public class HomePageCashierViews {
	@GetMapping("/delete-table")
	public String deleteTableViews() {
		return "deletetable";
	}
	
	@GetMapping("/add-table")
	public String addTableViews() {
		return "addtable";
	}
	
	@GetMapping("/pay")
	public String payViews() {
		return "pay";
	}
}
