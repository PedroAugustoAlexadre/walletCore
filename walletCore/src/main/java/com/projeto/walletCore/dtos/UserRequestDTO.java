package com.projeto.walletCore.dtos;

import com.projeto.walletCore.entity.UserType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record UserRequestDTO(
        @NotBlank(message = "O nome é obrigatório")
        String fullName,

        @NotBlank(message = "O documento (CPF/CNPJ) é obrigatório")
        String document,

        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "E-mail inválido")
        String email,

        @NotBlank(message = "A senha é obrigatória")
        String password,

        @NotNull(message = "O saldo inicial deve ser informado")
        @DecimalMin(value = "0.0", message = "O saldo não pode ser negativo")
        BigDecimal balance,

        @NotNull(message = "O tipo de usuário deve ser informado (COMMON ou MERCHANT)")
        UserType userType
) {
}