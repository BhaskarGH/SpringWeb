package com.bh.SpringWeb;

import com.bh.SpringWeb.config.DroolsBeanFactory;
import com.bh.SpringWeb.model.Customer;
import com.bh.SpringWeb.model.CustomerType;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

//@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringWebApplication.class, args);
		SpringWebApplication sb = new SpringWebApplication();
		sb.backwardChaining();
	}

	@Bean
	public WebClient.Builder getWebClient(){
		WebClient.Builder webClient = WebClient.builder();

		return webClient;
	}

	public Result backwardChaining() {
		Result result = new Result();
		KieSession kieSession = new DroolsBeanFactory().getKieSession();
		Customer customer = new Customer(CustomerType.INDIVIDUAL, 5);
		kieSession.insert(customer);

		kieSession.fireAllRules();
        System.out.println(customer.getDiscount());
		return result;
	}


}
