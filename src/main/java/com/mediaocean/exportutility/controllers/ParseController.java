package com.mediaocean.exportutility.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediaocean.exportutility.enums.ConverterType;
import com.mediaocean.exportutility.service.IConverterService;

@RestController
@RequestMapping("/mediaocean")
public class ParseController {
	
	@Autowired
	private IConverterService converterService;
	
	@PostMapping(path="{inputType}", produces=MediaType.APPLICATION_XML_VALUE)
	public void convertXML(@RequestBody String input,@PathVariable String inputType){
		converterService.convertTo(input,ConverterType.valueOf(inputType));
	}

}
