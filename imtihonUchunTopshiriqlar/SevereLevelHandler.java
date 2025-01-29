package imtihonUchunTopshiriqlar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SevereLevelHandler extends Handler {
    private Formatter formatter;

    public SevereLevelHandler() {
        formatter = new SevereLevelFormatter();
        setFormatter(formatter);
    }

    @Override
    public void publish(LogRecord record) {
        if (record.getLevel().intValue() >= Level.SEVERE.intValue()) {
            String formatted = getFormatter().format(record);
            System.out.println(formatted);
        }
        Throwable throwable = record.getThrown();
        if (throwable != null)
            throwable.printStackTrace(System.out);

    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(SevereLevelHandler.class.getName());
        logger.setUseParentHandlers(false);
        SevereLevelHandler handler = new SevereLevelHandler();
        logger.addHandler(handler);

        logger.severe("Bu severe log");
        logger.warning("Bu warning log");
        logger.info("Bu info log");

        try {
            throw new RuntimeException("Bu namuna xatoligi");
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE, "Xatolik yuz berdi", e);
        }
    }
}
