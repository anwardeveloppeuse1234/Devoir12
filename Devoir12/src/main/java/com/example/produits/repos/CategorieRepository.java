package com.example.produits.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.produits.entities.Categorie;
import com.example.produits.entities.Produit;

@RepositoryRestResource(path = "rest")
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

	List<Categorie> findByNomCat(String nom);
	 List<Categorie> findByNomCatContains(String nom);



 @Query("select c from Categorie c where c.nomCat like %:nom ")
 List<Categorie> findByNom (@Param("nom") String nom);
 
}
