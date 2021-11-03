package ru.forDaughter.telegram.simpleMathematical;

import ru.forDaughter.telegram.simpleMathematical.nonCommand.StaticService;
import ru.forDaughter.telegram.simpleMathematical.nonCommand.User;
import ru.forDaughter.telegram.simpleMathematical.messages.BotStatus;
import ru.forDaughter.telegram.simpleMathematical.messages.fromUser.Answer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyTelegramBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update){
        //We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            //Set variables
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            if (!StaticService.users.containsKey(chatId))
                StaticService.users.put(chatId, new User(chatId));

//            устанавливаем тип сообщениея
            new BotStatus(messageText);
            String answer = new Answer(messageText, chatId).getAnswer();

            SendMessage message = new SendMessage(); //Create a message object
            message.setChatId(String.valueOf(chatId));
//            System.out.println(new Addition().action());
//            message.setText("reply: " + messageText);
            message.setText(answer);

            try {
                execute(message);//Sending our message object to user
            } catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername(){
        // Return bot username
        // If bot username is @MyTelegramBotV1, it must return 'MyTelegramBotV1'
        return "SimpleMathematicalBot";
    }

    @Override
    public String getBotToken() {
        return "2057625181:AAHRW16mY7-RkIysgNZuy3lrJi7Oe8CFvuY";
    }
}
