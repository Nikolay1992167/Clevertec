package ru.clevertec.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private Long id;
    private TypeTransaction typeTransaction;
    @Builder.Default
    private Account fromAccount = null;
    @Builder.Default
    private Account toAccount = null;
    private BigDecimal amount;
    private LocalDateTime date;
}

