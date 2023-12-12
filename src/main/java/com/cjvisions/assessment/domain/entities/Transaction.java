package com.cjvisions.assessment.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private Long id;
    private BigDecimal amount;
    private LocalDateTime date;

    private TransactionType transactionType;

}
