package com.mediaocean.exportutility.service;

import com.mediaocean.exportutility.enums.ConverterType;

public interface IConverterService {
	public void convertTo(String parseString, ConverterType type);
}
