package com.example.noteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class NoteServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(NoteServiceApplication.class, args);
  }

}
