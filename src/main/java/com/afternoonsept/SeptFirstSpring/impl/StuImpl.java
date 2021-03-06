package com.afternoonsept.SeptFirstSpring.impl;

import com.afternoonsept.SeptFirstSpring.model.Student;
import com.afternoonsept.SeptFirstSpring.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by abhi on 10/09/17.
 */


@Service
public class StuImpl implements StudentRepo {

    @Value("${image.path}")
    String path;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getData() {

        String sql="select * from student";

        List<Student> list=jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(Student.class));

        return list;
    }

    @Override
    public void saveData(Student st) {

        String sql="insert into student values(?,?,?,?)";

        jdbcTemplate.update(sql,new Object[]{
                st.getId(),st.getName(),st.getImagePath(),st.getDept().getId()});

    }


}
