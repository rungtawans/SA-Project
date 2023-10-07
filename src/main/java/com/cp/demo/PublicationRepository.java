package com.cp.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cp.model.Publication;

public interface PublicationRepository extends JpaRepository<Publication, String> {

}
