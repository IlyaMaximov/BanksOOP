package edu.phystech.client;

import edu.phystech.response.ResponseWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "/client/add", method = RequestMethod.POST)
    public ResponseWrapper<ClientWrapper> addClient(
            @RequestBody ClientWrapper form
    ) {
        return new ResponseWrapper<>(new ClientWrapper(clientService.addClient(form.client())));
    }

    @RequestMapping(value = "/client/{clientId}")
    public ResponseWrapper<ClientWrapper> getClient(
            @PathVariable long clientId
    ) {
        return new ResponseWrapper<>(new ClientWrapper(clientService.getClient(clientId)));
    }

    private record ClientWrapper(Client client) {
    }
}
