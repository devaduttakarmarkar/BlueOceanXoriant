package com.mediaocean.exportutility.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mediaocean.exportutility.converter.impl.XMLType1Converter;
import com.mediaocean.exportutility.converter.impl.XMLType2Converter;
import com.mediaocean.exportutility.converterfactory.IConverterFactory;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public FactoryBean serviceLocatorfactoryBean(){
		ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
		factoryBean.setServiceLocatorInterface(IConverterFactory.class);
		return factoryBean;
	}
	
	@Bean(name="xmlType1")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public XMLType1Converter xml1Converter(){
		return new XMLType1Converter();
	}
	
	@Bean(name="xmlType2")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public XMLType2Converter xml2Converter(){
		return new XMLType2Converter();
	}
}
