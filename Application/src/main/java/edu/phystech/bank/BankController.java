package edu.phystech.bank;

import java.util.List;

import edu.phystech.account.BaseAccount;
import edu.phystech.response.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    private BankService service;

    @RequestMapping(value = "/bank/create", method = RequestMethod.POST)
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
    public ResponseWrapper<List<BaseAccount>> getBankAccounts(
            @PathVariable long bankId
    ) {
        return new ResponseWrapper<>(service.getBankAccounts(bankId));
    }
}
