/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelabs.teacher.Controller;

import com.codelabs.teacher.DTO.TeacherDTO;
import com.codelabs.teacher.Service.TeacherService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author puzansakya
 */
@Controller
@CrossOrigin
@RequestMapping(value = "/teachers")
public class TeacherController {

    @Autowired
    private TeacherService tService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<TeacherDTO> getAll() {
        return tService.getAll();
    }
}
