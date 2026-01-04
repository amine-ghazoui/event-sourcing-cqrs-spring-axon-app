package org.ghazoui.demoeventscqrsaxon.commands.dtos;

public record DebitAccountRequestDTO(String accountId, double amount, String currency) {
}
