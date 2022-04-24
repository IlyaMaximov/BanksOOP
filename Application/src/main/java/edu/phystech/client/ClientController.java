package edu.phystech.client;

import java.util.List;

import edu.phystech.response.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "client", description = "Client management")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "/bank/{bankId}/client/add", method = RequestMethod.POST)
    public ResponseWrapper<ClientWrapper> addClient(
            @PathVariable long bankId,
            @RequestParam("first_name") String firstName,
            @RequestParam("second_name") String secondName
    ) {
        return new ResponseWrapper<>(
                new ClientWrapper(clientService.addClient(new Client(bankId, firstName, secondName))));
    }

    @RequestMapping(value = "/bank/client/{clientId}/edit", method = RequestMethod.PUT)
    public ResponseWrapper<ClientWrapper> editClient(
            @PathVariable long clientId,
            @RequestBody Client client
    ) {
        return new ResponseWrapper<>(new ClientWrapper(clientService.changeClient(clientId, client)));
    }

    @RequestMapping(value = "/bank/client/{clientId}", method = RequestMethod.GET)
    public ResponseWrapper<ClientWrapper> getClient(
            @PathVariable long clientId
    ) {
        return new ResponseWrapper<>(new ClientWrapper(clientService.getClient(clientId)));
    }

    @RequestMapping(value = "/bank/{bankId}/clients", method = RequestMethod.GET)
    public ResponseWrapper<List<Client>> getBankClients(
            @PathVariable long bankId
    ) {
      return new ResponseWrapper<>(clientService.getBankClients(bankId));
    }

    private record ClientWrapper(Client client) {
    }
}
