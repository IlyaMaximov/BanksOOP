package edu.phystech.bank;

import edu.phystech.response.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
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
}
