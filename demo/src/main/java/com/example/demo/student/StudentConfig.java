package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student marian = new Student(
                    "Marian",
                    "marian.janusz@gmail.com",
                    LocalDate.of(1960, Month.JANUARY,5)

            );

            Student arnold = new Student(
                    "Arnold",
                    "arni.bejkon@gmail.com",
                    LocalDate.of(1965, Month.JANUARY,10)

            );

            repository.saveAll(List.of(marian, arnold));
        };
    }



}
