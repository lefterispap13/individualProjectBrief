package utils;

import com.lefterisPap.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Utilities {

    public static LocalDate newDate(String str){
        return LocalDate.parse(str, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
