package com.afternoonsept.SeptFirstSpring.repo;

import com.afternoonsept.SeptFirstSpring.model.Student;

import java.util.List;

/**
 * Created by abhi on 10/09/17.
 */
public interface StudentRepo {

    List<Student> getData();

    void saveData(Student st);
}
