package org.ghazoui.demoeventscqrsaxon.commands.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

public record CreditAccountRequestDTO(String accountId, double amount, String currency) {

}