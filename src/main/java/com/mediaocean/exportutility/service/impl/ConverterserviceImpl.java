package com.mediaocean.exportutility.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaocean.exportutility.converter.IConverter;
import com.mediaocean.exportutility.converterfactory.IConverterFactory;
import com.mediaocean.exportutility.enums.ConverterType;
import com.mediaocean.exportutility.service.IConverterService;

@Service
public class ConverterserviceImpl implements IConverterService{
	
	@Autowired
	IConverterFactory converterFactory;

	@Override
	public void convertTo(String parseString, ConverterType type) {
		IConverter converter = converterFactory.getConverter(type);
		converter.parseTo(parseString);
	}
}
