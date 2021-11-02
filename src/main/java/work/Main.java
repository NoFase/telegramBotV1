package work;

import work.nonCommand.StaticService;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
        private static final ScheduledExecutorService scheduler = Executors
                .newScheduledThreadPool(1);
        public static void main(String[] args) throws TelegramApiException {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new MyTelegramBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private static Runnable resetAllResults(){
        System.out.println("Test scheduler: " + new Date());
        StaticService.users.clear();
        return null;
    }


}
