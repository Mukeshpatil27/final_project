package com.CabAplication.Mukesh;

import com.CabAplication.Mukesh.Entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MukeshApplication {


	public static void main(String[] args) {
		SpringApplication.run(MukeshApplication.class, args);
	}

//	@Override
//	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
//		config.exposeIdsFor(User.class);
//	}


//	@Bean
//	public WebConfig corsConfigurer() {
//		return new WebConfig();
//	}

}
