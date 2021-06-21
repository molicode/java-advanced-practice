package utils;

import java.io.*;

public class Entry {
    public static String inicializar() {
        String box = "";
        InputStreamReader flow = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(flow);
        try {
            box = keyboard.readLine();
        } catch (Exception e) {
            System.out.append("Bad entry)");
        }
        return box;
    }

    public static int integer() {
        int value = Integer.parseInt(inicializar());
        return value;
    }

    public static double real() {
        double value = Double.parseDouble(inicializar());
        return value;
    }

    public static String strings() {
        String value = inicializar();
        return value;
    }

    public static char character() {
        String value = inicializar();
        return value.charAt(0);
    }
}


