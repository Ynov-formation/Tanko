package com.ynov.commerce.web;

import com.ynov.commerce.dto.ProduitDTO;
import com.ynov.commerce.entities.Produit;
import com.ynov.commerce.service.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/commerce")
public class ProduitRestRessources {

	private final ProduitService produitService;

	public ProduitRestRessources(ProduitService produitService) {
		this.produitService = produitService;
	}

	@GetMapping(value = "/produits")
	public List<ProduitDTO> getAllProduits() {
		return produitService.getAllProduits();
	}

	@GetMapping(value = "/produits/{id}")
	public Produit getProduitById(@PathVariable Long id) {
		return produitService.getProduitById(id);
	}

	@DeleteMapping(value = "/produits/{id}")
	public void deleteProduit(@PathVariable Long id) {
		produitService.deleteProduit(id);
	}

	@PostMapping(value = "/produits")
	public Produit saveProduit(@RequestBody Produit produit) {
		return produitService.saveProduit(produit);
	}

	@PutMapping(value = "/produits")
	public Produit updateProduit(@RequestBody Produit produit) {
		return produitService.updateProduit(produit);
	}
}
