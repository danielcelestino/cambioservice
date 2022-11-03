package br.com.daniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daniel.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
}
