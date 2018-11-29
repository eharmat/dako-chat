package edu.hm.dako.auditlog.server;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AuditLogAnalyser {
    public static void main(String[] args) {
        try {
            Files.write(Paths.get("main_output.txt"), "Some new text".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
