package edu.phystech.transaction;


import java.util.List;

import edu.phystech.exception.ApiException;
import org.springframework.stereotype.Service;

@Service
public record TransactionService(TransactionRepository repository) {


    public Transaction createTransaction(Transaction transaction) {
        if (transaction.getSourceAccountId() == 0 && transaction.getTargetAccountId() == 0) {
            throw new ApiException("Invalid Transaction");
        }
        return repository.save(transaction);
    }

    public List<Transaction> getAllTransactions(long creatorClientId) {
        return repository.findAllByCreatorClientId(creatorClientId);
    }
}
