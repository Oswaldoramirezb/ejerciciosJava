package org.generation.app.util;

import org.generation.app.service.StoreService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreServiceLoader implements CommandLineRunner{

	private StoreService storeService;
	
	public StoreServiceLoader(StoreService storeService) {
		this.storeService = storeService;
	}
	
	@Override
	public void run(String... args) throws Exception {

		storeService.checkout(25.00);
	}
	
}
