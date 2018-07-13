package com.mediaocean.exportutility.converterfactory;

import com.mediaocean.exportutility.converter.IConverter;
import com.mediaocean.exportutility.enums.ConverterType;

public interface IConverterFactory {
	IConverter getConverter(ConverterType type);
}
