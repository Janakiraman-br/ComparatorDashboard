package net.apmoller.athena.microservices.comparatordashboard;

import net.apmoller.athena.microservices.comparatordashboard.services.ComparatorDashboardServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ComparatorDashboardApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(ComparatorDashboardApplication.class, args);
	}

}
