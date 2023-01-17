package com.example.tgbot.components;

import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

import java.util.List;

public interface BotCommands {
    List<BotCommand> LIST_OF_COMMAND = List.of(
            new BotCommand("/start", "start bot"),
            new BotCommand("/help", "bot info")
    );

    String HELP_TEXT = "Этот бот считает количество сообщений в этом чате. " + "Доступные команды:\n\n"
            + "/start - запуск бота\n"
            + "/help - возможности";
}
