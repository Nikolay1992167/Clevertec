package ru.clevertec.data.bank.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestBank {
    private String name;
    private String bic;
}