package edu.phystech.transaction;


import java.util.List;

import org.springframework.stereotype.Service;

@Service
public record TransactionService(TransactionRepository repository) {

    public Transaction createTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    public List<Transaction> getAllTransactions(long creatorClientId) {
        return repository.findAllByCreatorClientId(creatorClientId);
    }
}
