package com.mediaocean.exportutility.enums;

public enum ConverterType {
	XMLTYPE1("xmlType1"),XMLTYPE2("xmlType2");
	
	private final String value;
	
	private ConverterType(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}
	
	@Override
	public String toString(){
		return this.value;
	}
}
