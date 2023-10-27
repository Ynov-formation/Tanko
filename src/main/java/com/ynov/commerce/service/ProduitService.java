package com.ynov.commerce.service;

import com.ynov.commerce.dto.ProduitDTO;
import com.ynov.commerce.entities.Produit;

import java.util.List;

public interface ProduitService {
	Produit getProduitById(Long id);

	Produit saveProduit(Produit produit);

	Produit updateProduit(Produit produit);

	void deleteProduit(Long id);

	List<ProduitDTO> getAllProduits();
}
