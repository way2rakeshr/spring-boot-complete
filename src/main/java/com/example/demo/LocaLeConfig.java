package com.example.demo;

import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.tomcat.util.http.parser.AcceptLanguage;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SuppressWarnings("deprecation")
@Configuration
public class LocaLeConfig {
	@Bean
	public AcceptHeaderLocaleResolver localeResolver() {
		/*SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);*/
		AcceptHeaderLocaleResolver acceptHeaderLocaleResolver = new AcceptHeaderLocaleResolver();
		acceptHeaderLocaleResolver.setDefaultLocale(Locale.US);
		return acceptHeaderLocaleResolver;

	}

	/*@Bean
	public ResourceBundleMessageSource bundleMessage() {
		ResourceBundleMessageSource resourcsBundle = new ResourceBundleMessageSource();
		resourcsBundle.addBasenames("messages");
		return resourcsBundle;
		spring.message.basename=messages ______you can configure in message the properties

	}
*/
}
