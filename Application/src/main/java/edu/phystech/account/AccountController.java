package edu.phystech.account;

import java.time.LocalDate;

import edu.phystech.response.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Tag(name = "account", description = "Account management")
public record AccountController(AccountService service) {
    @RequestMapping(value = "/bank/client/{clientId}/account/deposit/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseWrapper<DepositAccount> createDeposit(
            @PathVariable long clientId,
            @RequestParam(value = "up_to_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate upToDate
    ) {
        return new ResponseWrapper<>(service.createDepositAccount(clientId, upToDate));
    }

    @RequestMapping(value = "/bank/client/{clientId}/account/credit/create", method = RequestMethod.POST)
    public ResponseWrapper<CreditAccount> createCredit(
            @PathVariable long clientId
    ) {
        return new ResponseWrapper<>(service.createCreditAccount(clientId));
    }

    @RequestMapping(value = "/bank/client/{clientId}/account/debit/create", method = RequestMethod.POST)
    public ResponseWrapper<DebitAccount> createDebit(
            @PathVariable long clientId
    ) {
        return new ResponseWrapper<>(service.createDebitAccount(clientId));
    }
}
