package ru.forDaughter.telegram.simpleMathematical.nonCommand.services;

public class Helper {

    public String answer(){
        return "Для того чтобы начать упражнения нужно набрать комманду: \n"
                + "\t /help - вывести помощь или закончить упражнения\n"
                + "\t /+  - примеры на сложение\n"
                + "\t /-  - примеры на вычитание\n"
                + "\t /*  - примеры на умножение\n"
                + "\t /\\  - примеры на деление\n"
                + "\t /=  - статистика\n"
                ;
    }
}
