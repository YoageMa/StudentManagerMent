package com.myt.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String ename;
    private String email;
    private int gender;
    private int did;
    private String birthday;
    private String dname;
}
