package com.renanbarhbosa.projetofinalcapitulo.repositories;

import com.renanbarhbosa.projetofinalcapitulo.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
