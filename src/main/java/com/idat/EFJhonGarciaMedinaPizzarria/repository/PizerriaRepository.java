package com.idat.EFJhonGarciaMedinaPizzarria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJhonGarciaMedinaPizzarria.model.Pizerria;

@Repository
public interface PizerriaRepository extends JpaRepository<Pizerria, Integer> {

}
