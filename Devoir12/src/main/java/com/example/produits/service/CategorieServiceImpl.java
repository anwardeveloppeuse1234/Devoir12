package com.example.produits.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.produits.entities.Categorie;
import com.example.produits.entities.Produit;
import com.example.produits.repos.CategorieRepository;
@Service
public class CategorieServiceImpl implements CategorieService {
	 @Autowired
	    private CategorieRepository catRepository;

	    @Override
	    public List <Categorie> findAll() {
	        return catRepository.findAll();
	    }

		@Override
		public Categorie saveCategorie(Categorie c) {
			return catRepository.save(c);
		}

		@Override
		public Categorie updateCategorie(Categorie c) {
			return catRepository.save(c);
		}

		@Override
		public void deleteCategorie(Categorie c) {
			catRepository.delete(c);
		}

		@Override
		public void deleteCategorieById(Long idCat) {
			catRepository.deleteById(idCat);
		}

		@Override
		public Categorie getCategorie(Long idCat) {
			return catRepository.findById(idCat).get();
		}

	   
	}