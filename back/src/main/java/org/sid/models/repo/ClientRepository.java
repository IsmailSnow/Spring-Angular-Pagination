package org.sid.models.repo;

import javax.transaction.Transactional;

import org.sid.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ClientRepository extends JpaRepository<Client, Long> {

}
