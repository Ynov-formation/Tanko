package com.ynov.commerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProduitDTO {
	Long id;
	String nom;
	String description;
	Double prix;
	Integer quantite;
	CategorieDto categorie;
}
