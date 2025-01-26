package uz.pdp.LoggerTest;

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;

public class LoggerTest {

    public static Logger logger = Logger.getLogger(LoggerTest.class.getName());

    public static void main(String[] args) throws IOException {

        FileHandler fileHandler = new FileHandler("logs.file");

        fileHandler.setFormatter(new MyFormmater());

        logger.addHandler(fileHandler);



        logger.info( "Bu INFO orqali yozildi....");

        logger.log(new LogRecord(Level.INFO, "Bu LoggRecord  orqali yozildi...."));

        logger.severe("Bu Severe orqali yozildi....");

        exception();

    }

    public static void exception() {

        try {
            if (new Random().nextBoolean())
                throw new RuntimeException("Bu test uchun  ");
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE, "Exception", e);
            throw new RuntimeException(e);

        }
    }
}
//Multhreding dan bitta metodni qutqarish
//fayilga yozish va oqish
//Regex Txt
//github
//        System.setProperty("java.util.logging.config.file",
//                "C:\\Users\\HP ENVY\\IdeaProjects\\g50\\g50-modul-4\\untitled\\src\\main\\resources\\A.java");
