package imtihonUchunTopshiriqlar;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyFormater extends Formatter {
    //    public String format(LogRecord record) {
//
//        Instant instant = record.getInstant();
//        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd'T'HH:mm:ss");
//
//        String dateString = formatter.format(localDateTime);
//
//        String ClassName = record.getSourceClassName();
//
//        long threadID = record.getLongThreadID();
//
//        Level level = record.getLevel();
//
//        String message = record.getMessage();
//
//        Throwable thrown = record.getThrown();
//
//        if (thrown!=null){
//            StringWriter stringWriter = new StringWriter();
//            PrintWriter printWriter=new PrintWriter(stringWriter);
//            thrown.printStackTrace(printWriter);
//            message=message+"\n"+stringWriter;
//        }
//
//        return "%s %s %s%n%s: %s%n".formatted(dateString,ClassName,threadID,level,message);
//    }
    public String format(LogRecord record) {
        StringBuilder sb = new StringBuilder();
        sb.append(record.getLevel()).append(": ");
        sb.append(record.getMessage()).append("\n");

        // Agar throwable mavjud bo'lsa, uni chiqarish
        if (record.getThrown() != null) {
            record.getThrown().printStackTrace(new java.io.PrintWriter(System.out));
        }

        return sb.toString();
    }
}
