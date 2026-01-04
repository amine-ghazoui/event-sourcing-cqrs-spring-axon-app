package org.ghazoui.demoeventscqrsaxon.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.ghazoui.demoeventscqrsaxon.emums.AccountStatus;

@Getter @AllArgsConstructor
public class AccountChangedStatusEvent {
    private String accountId;
    private AccountStatus status;
}