package com.ssw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssw.model.Dominoz;

@Repository
public interface DominozRepository extends JpaRepository<Dominoz, Integer>{

}
