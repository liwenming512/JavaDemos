package com.imooc.mvc.demo.service;

import org.springframework.stereotype.Service;

import com.imooc.mvc.demo.model.Course;

@Service
public interface CourseService {

	Course getCoursebyId(Integer courseId);
}
