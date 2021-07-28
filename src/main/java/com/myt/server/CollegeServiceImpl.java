package com.myt.server;

import com.myt.mapper.CollegeMapper;
import com.myt.pojo.College;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegeMapper collegeMapper;

    @Override
    public List<College> getAll(){
        return collegeMapper.getAll();
    }
}
