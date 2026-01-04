package org.ghazoui.demoeventscqrsaxon.commands.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.ghazoui.demoeventscqrsaxon.emums.AccountStatus;

import java.io.Serializable;


public record UpdateAccountStatusRequestDTO(String accountId, AccountStatus status) {
}