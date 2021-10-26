package edu.phystech.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public Client addClient(Client newClient) {
        long clientId = clientDao.addClient(newClient);
        return clientDao.getClient(clientId);
    }

    public Client getClient(long clientId) {
        return clientDao.getClient(clientId);
    }
}
