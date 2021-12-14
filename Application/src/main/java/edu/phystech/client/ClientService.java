package edu.phystech.client;

import java.util.List;

import edu.phystech.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

@Service
public record ClientService(ClientRepository repository) {

    public Client addClient(Client newClient) {
        return repository.save(newClient);
    }

    public Client getClient(long clientId) {
        return repository.findById(clientId).orElseThrow(() -> new RuntimeException("Client not found"));
    }

    public Client changeClient(long clientId, Client client) {
        Client oldClient = repository.findById(clientId).orElseThrow(() -> new ObjectNotFoundException(clientId));
        client.setBankId(oldClient.getBankId());
        client.setId(clientId);
        verifyClient(client);
        return repository.save(client);
    }

    public List<Client> getBankClients(long bankId) {
        return repository.getAllByBankId(bankId);
    }

    private void verifyClient(Client client) {
        client.setVerified(client.getAddress() != null && client.getPassportData() != null);
    }
}
