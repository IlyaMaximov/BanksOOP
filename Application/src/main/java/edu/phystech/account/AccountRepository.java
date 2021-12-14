package edu.phystech.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<BaseAccount, Long> {
    List<BaseAccount> findAllByBankId(long bankId);
}
