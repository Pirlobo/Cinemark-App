package com.anc.cinema.Repositories;

import com.anc.cinema.Entities.Film;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface FilmRepository extends JpaRepository<Film, Long> {
	
	public static final String query = "select * from film as f where f.titre like %?1%";

	@Query(value = query, nativeQuery = true)
	List<Film> findByTitre(String titre);
}
