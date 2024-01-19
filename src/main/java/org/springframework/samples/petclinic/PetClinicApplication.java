package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PetClinicApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(PetClinicApplication.class, args);
		if (Boolean.getBoolean("PetClinicApplication.shutDown")) {
			ctx.close();
		}
	}
}
