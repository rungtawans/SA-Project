package com.cp.demo;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cp.model.Publication;

public class PublicationController {

	private final PublicationService publicationService;
	@Autowired
    public PublicationController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }
	@GetMapping("/show_research")
    public String showResearch(Model model) {
        java.util.List<Publication> publications = publicationService.getAllPublications();
        model.addAttribute("publications", publications);
        return "show_publication";
    }
	@GetMapping("/research-detail/{paperId}")
    public String publicationDetail(@PathVariable String paperId, Model model) {
        Publication publication = publicationService.getPublicationById(paperId);
        model.addAttribute("publication", publication);
        return "publication-detail";
    }

}
