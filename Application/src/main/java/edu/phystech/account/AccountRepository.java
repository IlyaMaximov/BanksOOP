package edu.phystech.account;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<BaseAccount, Long> {
}
