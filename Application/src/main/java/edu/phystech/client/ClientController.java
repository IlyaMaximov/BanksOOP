package edu.phystech.client;

import edu.phystech.response.ResponseStatus;
import edu.phystech.response.ResponseWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseWrapper<Client> addClient(
            @RequestParam("first_name") String firstName,
            @RequestParam("second_name") String secondName
    ) {
        return new ResponseWrapper<>(new Client(0, firstName, secondName, null, null, false));
    }
}
