package edu.phystech.client;

import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientDao;

    public ClientService(ClientRepository clientDao) {
        this.clientDao = clientDao;
    }

    public Client addClient(Client newClient) {
        return clientDao.save(newClient);
    }

    public Client getClient(long clientId) {
        return clientDao.findById(clientId).orElseThrow(() -> new RuntimeException("Client not found"));
    }
}
