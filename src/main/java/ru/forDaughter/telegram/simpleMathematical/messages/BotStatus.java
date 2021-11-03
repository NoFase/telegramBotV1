package ru.forDaughter.telegram.simpleMathematical.messages;

import ru.forDaughter.telegram.simpleMathematical.nonCommand.StaticService;

import java.util.Locale;

public class BotStatus {

    public BotStatus(String message) {
//        if (!StaticService.typeOfMessage.equalsIgnoreCase("misunderstand"))
            switch (message.toLowerCase(Locale.ROOT)) {
                case ("/help"):
                    StaticService.typeOfMessage = "help";
                    break;
                case ("/+"):
                    StaticService.typeOfMessage = "addition";
                    break;
                case ("/*"):
                    StaticService.typeOfMessage = "multiplication";
                    break;
                case ("/-"):
                    StaticService.typeOfMessage = "subtract";
                    break;
                case ("/\\"):
                    StaticService.typeOfMessage = "division";
                    break;
                case ("/="):
                    StaticService.typeOfMessage = "result";
                    break;
//                case ("/отчет"):
//                    StaticService.typeOfMessage = "result";
//                    break;
//                default:
//                    StaticService.typeOfMessage = "misunderstand";
//                    break;
            }
    }
}
