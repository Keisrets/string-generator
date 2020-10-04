package util;

public class StringGenerator {

    private static String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

    public static String randomString(int length) {

        String string = "";

        for(int i = 0; i < length; i++) {
            int index = (int) (symbols.length() * Math.random());
            string += symbols.charAt(index);
        }

        return string;
    }
}