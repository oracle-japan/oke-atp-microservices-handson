package com.workshop.okeatp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.workshop.okeatp.dataset.Items;
import com.workshop.okeatp.facade.WorkshopFacade;

@Controller
@RequestMapping("/")
public class WorkshopController {

	@Autowired
	WorkshopFacade workshopFacade;

	@ResponseBody
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}

	@GetMapping("")
	public String goIndex(Model model) {

		List<Items> itemsList = workshopFacade.selectItemsList();
		model.addAttribute("itemsList", itemsList);
		return "index";
	}

}
