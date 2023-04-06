package com.shopseg.bot_service.initialize;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import com.shopseg.bot_service.build.BotService;

public class StartBot {

	public static void run () {
		try {
			TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
			telegramBotsApi.registerBot(new BotService());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}

