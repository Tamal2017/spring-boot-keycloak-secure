package com.app.secure.example.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class productController {
	
	private List<String> list = Arrays.asList("Table", "Chair", "TV", "Plat", "prepaid food");

	@GetMapping("/products")
	public List<String> getProduct(Model model) {		
		
		return list;

	}
	
	@GetMapping("/logout")
	public String logOut(HttpServletRequest request) throws ServletException {		
		request.logout();
		return "/";

	}

}

