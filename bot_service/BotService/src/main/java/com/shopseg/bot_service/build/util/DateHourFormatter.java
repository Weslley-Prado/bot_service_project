package com.shopseg.bot_service.build.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHourFormatter {
	public static String getData() {
        var formatter = new SimpleDateFormat("dd/MM/yyyy");
        return "A data atual é: " + formatter.format(new Date());
    }

    public static String getHora() {
        var formatter = new SimpleDateFormat("HH:mm:ss");
        return "A hora atual é: " + formatter.format(new Date());
    }
    
}
