package edu.phystech.transaction;

import java.util.List;

import edu.phystech.response.ResponseWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @RequestMapping(value = "/bank/client/{clientId}/transaction/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseWrapper<Transaction> transfer(
            @PathVariable long clientId,
            @RequestParam(name = "source_account_id") long sourceAccountId,
            @RequestParam(name = "target_account_id") long targetAccountId,
            @RequestParam Currency currency,
            @RequestParam long amount
    ) {
        return new ResponseWrapper<>(
                transactionService.createTransaction(
                        new Transaction(clientId, sourceAccountId, targetAccountId, amount, currency))
        );
    }

    @RequestMapping(value = "/transactions/list", method = RequestMethod.GET)
    @ResponseBody
    public ResponseWrapper<List<Transaction>> getAllTransactionsByCreatorId(
            @RequestParam(value = "creator_client_id") long creatorClientId
    ) {
        return new ResponseWrapper<>(transactionService.getAllTransactions(creatorClientId));
    }
}
