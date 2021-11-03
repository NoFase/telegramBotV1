package ru.forDaughter.telegram.simpleMathematical.messages.fromUser;

import ru.forDaughter.telegram.simpleMathematical.nonCommand.StaticService;

import ru.forDaughter.telegram.simpleMathematical.nonCommand.services.*;

public class Answer {
    private String answer;
    private Long chatId;

    public Answer(String message, Long chatId) {
        this.chatId = chatId;
        switch (StaticService.typeOfMessage){
            case ("help"):
                answer = new Helper().answer();
                StaticService.amount = -1;
                break;
            case ("addition"):
                answer = answering(message);
                if (answer.equals("Правильно!")) {
                    answer = answer + "\n" + new Addition().action();
                    StaticService.users.get(chatId).setRightAddition(StaticService.users.get(chatId).getRightAddition() + 1);
                } else StaticService.users.get(chatId).setWrongAddition(StaticService.users.get(chatId).getWrongAddition() + 1);
                if (StaticService.amount == -1)
                    answer = new Addition().action();
                break;
            case ("subtract"):
                answer = answering(message);
                if (answer.equals("Правильно!")) {
                    answer = answer + "\n" + new Subtraction().action();
                    StaticService.users.get(chatId).setRightSubtraction(StaticService.users.get(chatId).getRightSubtraction() + 1);
                } else StaticService.users.get(chatId).setWrongSubtraction(StaticService.users.get(chatId).getWrongSubtraction() + 1);
                if (StaticService.amount == -1) answer = new Subtraction().action();
                break;
            case ("multiplication"):
                answer = answering(message);
                if (answer.equals("Правильно!")) {
                    answer = answer + "\n" + new Multiplication().action();
                    StaticService.users.get(chatId).setRightMultiplication(StaticService.users.get(chatId).getRightMultiplication() + 1);
                } else StaticService.users.get(chatId).setWrongMultiplication(StaticService.users.get(chatId).getWrongMultiplication() + 1);

                if (StaticService.amount == -1) answer = new Multiplication().action();
                break;
            case ("division"):
                answer = answering(message);
                if (answer.equals("Правильно!")) {
                    answer = answer + "\n" + new Division().action();
                    StaticService.users.get(chatId).setRightDivision(StaticService.users.get(chatId).getRightDivision() + 1);
                } else StaticService.users.get(chatId).setWrongDivision(StaticService.users.get(chatId).getWrongDivision() + 1);

                if (StaticService.amount == -1) answer = new Division().action();
                break;
            case ("result"):
                answer = StaticService.users.get(chatId).toString();
                break;
        }
    }

    public String getAnswer() {
        return answer;
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private String answering(String message) {
        String preAnswer;
        if (isNumeric(message)) {
            if (Integer.parseInt(message) == StaticService.amount) {
                preAnswer = "Правильно!";

            } else {
                preAnswer = "Не верно, попробуй еще раз.";

            }
        } else preAnswer = "Не понимаю, что ты пишешь. Напиши ответ цифрами.";
        return preAnswer;
    }

}
