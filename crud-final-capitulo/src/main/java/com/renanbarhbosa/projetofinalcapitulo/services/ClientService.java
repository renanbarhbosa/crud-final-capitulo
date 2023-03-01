package com.renanbarhbosa.projetofinalcapitulo.services;

import com.renanbarhbosa.projetofinalcapitulo.dto.ClientDTO;
import com.renanbarhbosa.projetofinalcapitulo.entities.Client;
import com.renanbarhbosa.projetofinalcapitulo.repositorie.ClientRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAllPaged(Pageable pageable) {
        Page<Client> list = repository.findAll(pageable);
        return list.map(x -> new ClientDTO(x));
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> obj = repository.findById(id);
        Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found."));
        return new ClientDTO(entity);
    }

    public ClientDTO insert(ClientDTO dto) {
        return null;
    }

    public ClientDTO update(Long id, ClientDTO dto) {
        return null;
    }

    public void delete(Long id) {
        return;
    }
}
