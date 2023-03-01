package com.renanbarhbosa.projetofinalcapitulo.repositorie;

import com.renanbarhbosa.projetofinalcapitulo.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
