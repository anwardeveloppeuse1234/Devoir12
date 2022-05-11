package com.example.produits.service;
import java.util.List;

import com.example.produits.entities.Categorie;

public interface CategorieService {
	List <Categorie> findAll();
    Categorie saveCategorie(Categorie c);
    Categorie updateCategorie(Categorie c);
    void deleteCategorie(Categorie c);
     void deleteCategorieById(Long id);
     Categorie getCategorie (Long idCat);

	
}