package uz.pdp.LoggerTest;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class TelegramHendler extends StreamHandler {
    @Override
    public synchronized void publish(LogRecord record) {

        String format = this.getFormatter().format(record);

        SendMessage message = new SendMessage("6367404249", format);

        TgSender tgSender = TgSender.getInstance();

        try {
            tgSender.execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }
/*
  Message message = update.getMessage();
        String text = message.getText();
        System.out.println(text);
        Long chatId = message.getChatId();

        SendMessage sendMessage = new SendMessage(chatId.toString(), text);

 */
    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getLevel() == Level.SEVERE;
    }
}
