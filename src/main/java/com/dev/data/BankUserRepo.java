package com.dev.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.BankUser;

public interface BankUserRepo extends JpaRepository<BankUser, Integer>{

	public List<BankUser> findByUsername(String username);

}
