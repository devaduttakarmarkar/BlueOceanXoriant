package com.mediaocean.exportutility.enums;

public enum ConverterType {
	XMLType1("xmlType1"),XMLType2("xmlType2");
	
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
	
	public static ConverterType getTypeValue(String value){
		for(ConverterType type:values())
			if(type.getValue().equalsIgnoreCase(value)) return type;
		 throw new IllegalArgumentException();	
	}
}
