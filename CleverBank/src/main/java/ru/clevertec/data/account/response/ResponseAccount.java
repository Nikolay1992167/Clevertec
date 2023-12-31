package ru.clevertec.data.account.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class ResponseAccount {
    private Long id;
    private String currency;
    private String dateOpen;
    private String number;
    private BigDecimal balance;
    private String bankTitle;
    private String userName;
}
