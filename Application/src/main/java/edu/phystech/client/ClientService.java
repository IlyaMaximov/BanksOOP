package edu.phystech.client;

import org.springframework.stereotype.Service;

@Service
public record ClientService(ClientRepository clientDao) {

    public Client addClient(Client newClient) {
        return clientDao.save(newClient);
    }

    public Client getClient(long clientId) {
        return clientDao.findById(clientId).orElseThrow(() -> new RuntimeException("Client not found"));
    }
}
