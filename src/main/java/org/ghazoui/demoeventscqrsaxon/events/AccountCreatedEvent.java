package org.ghazoui.demoeventscqrsaxon.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.ghazoui.demoeventscqrsaxon.emums.AccountStatus;

@Getter @AllArgsConstructor
public class AccountCreatedEvent {
    private String accountId;
    private double initialBalance;
    private AccountStatus accountStatus;
    private String currency;
}