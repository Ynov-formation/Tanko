package com.ynov.commerce;

import com.ynov.commerce.dao.CategorieRepository;
import com.ynov.commerce.dao.ProduitRepository;
import com.ynov.commerce.entities.Categorie;
import com.ynov.commerce.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommerceApplication implements CommandLineRunner {
	@Autowired
   private ProduitRepository produitRepository;
	@Autowired
   private CategorieRepository categorieRepository;
	public static void main(String[] args) {
		SpringApplication.run(CommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		produitRepository.findAll().forEach(p -> {
            if (p.getCategorie() != null) {
                System.out.println(p.getCategorie().getNom());
            } else {
                System.out.println("Categorie null");
            }
        });
	}
}
