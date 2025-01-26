package uz.pdp.LoggerTest;

import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;

public class TgSender extends DefaultAbsSender {

    protected TgSender(DefaultBotOptions options, String botToken) {
        super(options, botToken);
    }

    public static TgSender getInstance() {
        return new TgSender(new DefaultBotOptions(), "7429350412:AAG3QYkFNzLSlTNKAoiZ73Ex2tCnPE5Aw1c");
    }

}
