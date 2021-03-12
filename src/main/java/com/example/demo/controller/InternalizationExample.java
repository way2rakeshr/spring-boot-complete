package com.example.demo.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class InternalizationExample {
	@Autowired
	 MessageSource messageSource;
	
	@GetMapping("/hello-world")
	/*public String HelloWorld(@RequestHeader(defaultValue="false",name="Accept-Language") Locale locale){
		return  messageSource.getMessage("good.morning.message", null, locale);
		these method i need to configure for everything so to avoid these we are going with acceptLocaleHweader instead of seesion
	}*/
	public String HelloWorld(){
		return  messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}

}
