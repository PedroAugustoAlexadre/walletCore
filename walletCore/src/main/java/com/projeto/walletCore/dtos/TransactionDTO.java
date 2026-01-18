package com.projeto.walletCore.dtos;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

public record TransactionDTO(
        @NotNull(message = "O valor da transação é obrigatório")
        @DecimalMin(value = "0.01", message = "O valor da transferência deve ser pelo menos 0.01")
        BigDecimal value,

        @NotNull(message = "O ID do pagador (payer) é obrigatório")
        UUID payer,

        @NotNull(message = "O ID do recebedor (payee) é obrigatório")
        UUID payee
) { }