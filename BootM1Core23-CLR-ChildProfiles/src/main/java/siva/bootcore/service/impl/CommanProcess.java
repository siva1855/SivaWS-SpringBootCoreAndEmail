package siva.bootcore.service.impl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("default")
public class CommanProcess implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("from CommanProcess");

	}

}
