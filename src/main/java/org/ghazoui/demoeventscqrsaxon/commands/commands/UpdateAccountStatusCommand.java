package org.ghazoui.demoeventscqrsaxon.commands.commands;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.ghazoui.demoeventscqrsaxon.emums.AccountStatus;


@Getter @AllArgsConstructor
public class UpdateAccountStatusCommand {
    @TargetAggregateIdentifier
    private String id;
    private AccountStatus status;
}