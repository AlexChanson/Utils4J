package com.alexsxode.utilities.http;

import java.io.IOException;
import java.io.OutputStream;

public class Utils {
    static void sendHeader(OutputStream out, HttpAns ans) throws IOException {
        ans.printTo(out);
        printDelimitter(out);
    }

    static void printResponse(OutputStream out, String header, String body) throws IOException {
        out.write(header.getBytes());
        printDelimitter(out);
        out.write(body.getBytes());
    }

    static void printDelimitter(OutputStream out) throws IOException {
        out.write(new byte[]{0x0d, 0x0a});
    }
}
