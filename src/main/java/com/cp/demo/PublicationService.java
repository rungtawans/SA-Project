package com.cp.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cp.model.Publication;

@Service
public class PublicationService {
	private final PublicationRepository publicationRepository;
	
	@Autowired
    public PublicationService(PublicationRepository publicationRepository) {
        this.publicationRepository = publicationRepository;
    }
	public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }

    public Publication getPublicationById(String paperId) {
        return publicationRepository.findById(paperId).orElse(null);
    }
    
}
