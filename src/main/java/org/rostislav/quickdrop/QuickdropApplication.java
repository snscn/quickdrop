package org.rostislav.quickdrop;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootApplication
public class QuickdropApplication {
    @Value("${file.save.path}")
    private String fileSavePath;


    public static void main(String[] args) {
        SpringApplication.run(QuickdropApplication.class, args);
    }

    @PostConstruct
    public void createFileSavePath() {
        try {
            Files.createDirectories(Path.of(fileSavePath));
            System.out.println("Directory created: " + fileSavePath);
        } catch (Exception e) {
            System.err.println("Failed to create directory: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
