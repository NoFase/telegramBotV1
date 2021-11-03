package ru.forDaughter.telegram.simpleMathematical.nonCommand;

public class User {
    private Long chatId;

    private int all;
    private int allRight;

    private int rightAddition;
    private int wrongAddition;
    private int rightSubtraction;
    private int wrongSubtraction;
    private int rightMultiplication;
    private int wrongMultiplication;
    private int rightDivision;
    private int wrongDivision;

    public int getRightMultiplication() {
        return rightMultiplication;
    }

    public void setRightMultiplication(int rightMultiplication) {
        this.rightMultiplication = rightMultiplication;
    }

    public int getWrongMultiplication() {
        return wrongMultiplication;
    }

    public void setWrongMultiplication(int wrongMultiplication) {
        this.wrongMultiplication = wrongMultiplication;
    }

    public int getRightDivision() {
        return rightDivision;
    }

    public void setRightDivision(int rightDivision) {
        this.rightDivision = rightDivision;
    }

    public int getWrongDivision() {
        return wrongDivision;
    }

    public void setWrongDivision(int wrongDivision) {
        this.wrongDivision = wrongDivision;
    }



    public int getAllRight() {
        allRight = rightAddition + rightSubtraction + rightDivision + rightMultiplication;
        return allRight;
    }

    public int getAll() {
        all = rightAddition + wrongAddition + rightSubtraction + wrongSubtraction + rightDivision
            + rightMultiplication + wrongMultiplication + wrongDivision;
        return all;
    }

    public User(Long chatId) {
        this.chatId = chatId;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public int getRightAddition() {
        return rightAddition;
    }

    public void setRightAddition(int rightAddition) {
        this.rightAddition = rightAddition;
    }

    public int getWrongAddition() {
        return wrongAddition;
    }

    public void setWrongAddition(int wrongAddition) {
        this.wrongAddition = wrongAddition;
    }

    public int getRightSubtraction() {
        return rightSubtraction;
    }

    public void setRightSubtraction(int rightSubtraction) {
        this.rightSubtraction = rightSubtraction;
    }

    public int getWrongSubtraction() {
        return wrongSubtraction;
    }

    public void setWrongSubtraction(int wrongSubtraction) {
        this.wrongSubtraction = wrongSubtraction;
    }

    @Override
    public String toString() {
        return  "\nВсего было примеров: " + getAll() +
                "\nПравильно решено: " + getAllRight() +
                "\nПравильно на сложение: " + rightAddition +
                "\nНе правильно на сложение: " + wrongAddition +
                "\nПравильно на вычитание: " + rightSubtraction +
                "\nНе правильно на вычитание: " + wrongSubtraction +
                "\nПравильно на умножение: " + rightMultiplication +
                "\nНе правильно на умножение: " + wrongMultiplication +
                "\nПравильно на деление: " + rightDivision +
                "\nНе правильно на деление: " + wrongDivision
                ;
    }
}
