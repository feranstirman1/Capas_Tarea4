package com.uca.capas.Tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.Tarea4.model.Producto;

@Controller
public class MainController {

	@RequestMapping("/producto")
	public ModelAndView producto() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("producto");
		return mav;
	}
	
	@RequestMapping("/ingresar")
	public ModelAndView ingresar(@Valid @ModelAttribute Producto producto,BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("producto");
			return mav;
		}else {
			mav.addObject("nombre", producto.getNombre());
			mav.setViewName("resultado");
			return  mav;
		}
	}
	
}
