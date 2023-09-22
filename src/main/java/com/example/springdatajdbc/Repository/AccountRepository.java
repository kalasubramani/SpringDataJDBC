package com.example.springdatajdbc.Repository;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.springdatajdbc.Model.Account;



public interface AccountRepository extends CrudRepository<Account, Long> {
  
  @Query("SELECT * FROM account123 WHERE name = :name")
  List<Account> findAccounts123ByName(String name);

  @Modifying                                                     
  @Query("UPDATE account123 SET account123 = :amount WHERE id = :id")
  void changeAmount(long id, BigDecimal amount);


}

