package com.shopseg.bot_service.build;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import com.shopseg.bot_service.build.util.BotDatas;
import com.shopseg.bot_service.build.util.DateHourFormatter;


@SuppressWarnings("deprecation")
@Component
public class BotService extends TelegramLongPollingBot {
	@Override
	public String getBotUsername() {
        return BotDatas.BOT_USER_NAME;
    }
	@Override
    public String getBotToken() {
        return BotDatas.BOT_TOKEN;
                
    }
	 @Override
	    public void onUpdateReceived(Update update) {

	        if (update.hasMessage() && update.getMessage().hasText()) {
	            var message = reply(update);
	            try {
	                execute(message);
	            } catch (TelegramApiException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    private SendMessage reply(Update update) {
	        var messageText = update.getMessage().getText().toLowerCase();
	        var chatId = update.getMessage().getChatId().toString();

	        var response = "";

	        if ("data".equals(messageText)) {
	        	response = DateHourFormatter.getData();
	        } else if (messageText.startsWith("hora")) {
	        	response = DateHourFormatter.getHora();
	        } else if (messageText.startsWith("ola") || messageText.startsWith("olá") || messageText.startsWith("oi")) {
	        	response = "\uD83E\uDD16 Olá, vejo que você entende muito sobre BOTS!";
	        } else if (messageText.startsWith("quem é você") || messageText.startsWith("quem e voce")) {
	        	response = "\uD83E\uDD16 Eu sou um bot";
	        } else if (messageText.startsWith("/menu")) {
	        	response = "Utilize um dos comandos:\nolá\ndata\nhora\nquem é você?";
	        } else {
	        	response = "/menu";
	        }

	        return SendMessage.builder()
	                .text(response)
	                .chatId(chatId)
	                .build();
	    }
 
}



