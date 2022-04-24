package edu.phystech.bank;

import java.util.List;

import edu.phystech.account.BaseAccount;
import edu.phystech.response.ResponseWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "bank", description = "Bank management")
public class BankController {

    @Autowired
    private BankService service;

    @RequestMapping(value = "/bank/create", method = RequestMethod.POST)
    @Operation(description = "Creates new bank")
    public ResponseWrapper<Bank> createBank(
            @RequestParam(value = "debit_percentage") double debitPercentage,
            @RequestParam(value = "credit_commission") double creditCommission,
            @RequestParam(value = "unverified_amount_limit") long unverifiedAmountLimit
    ) {
        return new ResponseWrapper<>(service.createBank(
                new Bank(debitPercentage, creditCommission, unverifiedAmountLimit))
        );
    }

    @RequestMapping(value = "/bank/{bankId}/accounts", method = RequestMethod.GET)
    @Operation(description = "Lists all bank accounts")
    public ResponseWrapper<List<BaseAccount>> getBankAccounts(
            @PathVariable long bankId
    ) {
        return new ResponseWrapper<>(service.getBankAccounts(bankId));
    }
}
