/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelabs.teacher.Service.Impl;

import com.codelabs.entity.Teacher;
import com.codelabs.teacher.DAO.TeacherDAO;
import com.codelabs.teacher.DTO.TeacherDTO;
import com.codelabs.teacher.Service.TeacherService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author puzansakya
 */
@Service(value = "TeacherService")
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDAO tDAO;

    @Override
    public List<TeacherDTO> getAll() {
        List<TeacherDTO> tDTOList = new ArrayList<>();
        for (Teacher teacher : tDAO.getAll()) {
            TeacherDTO td = new TeacherDTO();
            td.setTeacherId(teacher.getTeacherId());
            td.setFirstName(teacher.getFirstName());
            td.setLastName(teacher.getLastName());
            td.setContactNo(teacher.getContactNo());
            td.setAddress(teacher.getAddress());
            tDTOList.add(td);
        }
        return tDTOList;
    }

    @Override
    public TeacherDTO insert(TeacherDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(TeacherDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TeacherDTO getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
