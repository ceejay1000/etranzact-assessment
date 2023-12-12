package com.cjvisions.assessment.domain.dtos;

import com.cjvisions.assessment.domain.entities.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record Transaction(UUID transactionId, BigDecimal amount, LocalDateTime date, TransactionType transactionType) {
}
