package pro.sky.telegrambot.exception;

public class TelegramApiException extends RuntimeException{

    public TelegramApiException() {
    }

    @Override
    public String getMessage() {
        return "Ошибка сообщения";
    }
}
