package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class MangmentEmployee {

    private int id;

    private String name;

    private int age;

    private String position;

    private boolean onLeave;

    private int employmentYear;

    private String annualLeave;
}
