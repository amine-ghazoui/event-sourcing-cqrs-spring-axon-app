package org.ghazoui.demoeventscqrsaxon.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class AccountDebitedEvent {
    private String accountId;
    private double amount;
    private String currency;
}