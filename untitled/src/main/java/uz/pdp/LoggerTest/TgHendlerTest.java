package uz.pdp.LoggerTest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TgHendlerTest {

    public static Logger logger = Logger.getLogger(TelegramHendler.class.getName());

    public static void main(String[] args) {
        TelegramHendler telegramHendler = new TelegramHendler();

        telegramHendler.setFormatter(new MyFormmater());

        logger.addHandler(telegramHendler);

        logger.severe("This and  not sent telegram ");
        exceptionTest();
    }

    public static void exceptionTest() {

        try {
            if (true)
                throw new RuntimeException("Bu xabarni tgga uzatishda xatolik roy berdi....");
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
    }
}
