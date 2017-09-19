package com.afternoonsept.SeptFirstSpring.impl;

import com.afternoonsept.SeptFirstSpring.model.Dept;
import com.afternoonsept.SeptFirstSpring.repo.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by abhi on 19/09/17.
 */


@Repository
public class DeptImpl implements DeptRepo{

    @Autowired
    JdbcTemplate jdbcTemplate;



    public void saveDept(Dept dept) {

        String sql="insert into dept values(?,?)";

        jdbcTemplate.update(sql,new Object[]{
                dept.getId(),dept.getDeptName()});


    }
}
