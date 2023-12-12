package com.cjvisions.assessment.repository;

import com.cjvisions.assessment.domain.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
