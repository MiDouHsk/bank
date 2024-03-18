package com.rs.bankapp_v3.repository;

import com.rs.bankapp_v3.models.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    //to do:
}
