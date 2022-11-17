package com.devsuperior.dsmeta.config.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.config.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
