package com.itemCatalog;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ItemInitializer implements CommandLineRunner {
	
	private final ItemRepository itemRepo;
	
	public ItemInitializer(ItemRepository repo) {
		this.itemRepo = repo;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run method -- ItemInitializer");
		Stream.of("Biba", "Libas", "Khadi", "West Side").forEach(item -> itemRepo.save(new Item(item)));
		itemRepo.findAll().forEach(System.out::println);
	}

}
