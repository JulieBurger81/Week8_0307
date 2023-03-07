/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 5, 2023
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Vacation;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Vacation vacation() {
		Vacation bean = new Vacation();
		bean.setResortName("Aparthotel Adagio Paris Centre Tour Eiffel");
		bean.setMilesFromHome(4374);
		bean.setVisted(true);
		bean.setGrade('B');
		return bean;
	}
}
