package app.revanced.bilibili.utils;

import java.util.Arrays;

public class StringDecoder {
    public static byte[] decode(String input) {
        if (input.isEmpty()) {
            return new byte[0];
        }

        String alphabet = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
        byte[] inputBytes = new byte[input.length()];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int digit = alphabet.indexOf(c);
            inputBytes[i] = (byte) digit;
        }

        int zeroCount = 0;
        while (zeroCount < inputBytes.length && inputBytes[zeroCount] == 0) {
            zeroCount++;
        }

        byte[] decoded = new byte[input.length()];
        int j = decoded.length;

        int startAt = zeroCount;
        int base = Integer.parseInt("1q", 32);
        while (startAt < inputBytes.length) {
            int remainder = 0;
            for (int i = startAt; i < inputBytes.length; i++) {
                int digit = (inputBytes[i] & 0xFF) + remainder * base;
                inputBytes[i] = (byte) (digit / 256);
                remainder = digit % 256;
            }

            decoded[--j] = (byte) remainder;

            if (inputBytes[startAt] == 0) {
                startAt++;
            }
        }

        while (j < decoded.length && decoded[j] == 0) {
            j++;
        }

        return Arrays.copyOfRange(decoded, j - zeroCount, decoded.length);
    }
}
