package org.sid;

import org.sid.models.Client;
import org.sid.models.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceConfigApplication implements CommandLineRunner{
	
	@Autowired
	private ClientRepository clientRepository ;

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfigApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		
	 for(int i=0;i<30;i++){
		Client client = new Client();
		client.setNom("Ismail");
		client.setPrenom("Snow");
		client.setCIN("4YP5657");
		client.setAddress("Casablanca");
		clientRepository.save(client);
	 }
			
	}

}
