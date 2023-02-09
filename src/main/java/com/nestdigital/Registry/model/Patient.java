package com.nestdigital.Registry.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "patients")
public class Patient {
    @Id
    private int id;
    private String patient_name;
    private String gender;
    private String phone;
    private int age;
    private String address;
    private String doctor_name;




}
