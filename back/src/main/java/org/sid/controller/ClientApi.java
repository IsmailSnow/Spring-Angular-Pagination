package org.sid.controller;

import java.util.List;

import org.sid.models.Client;
import org.sid.models.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientApi {

	@Autowired
	private ClientRepository clientRepository;

	@GetMapping("/clients")
	public List<Client> getAllClient() {

		return clientRepository.findAll();
	}
	
	@GetMapping("/clients/get")
	public Page<Client> getClientPage(@RequestParam("page") int page, @RequestParam("size") int size) {
		Sort sort = Sort.by( new Sort.Order(Direction.ASC, "nom"));
		Pageable pageable = PageRequest.of(page, size, sort);
		return clientRepository.findAll(pageable);
	}

}
