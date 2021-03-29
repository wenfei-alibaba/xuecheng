package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CourseBase;
import org.apache.ibatis.annotations.Mapper;

/**
 * created by xuwenfei 2021-03-24
 */
@Mapper
public interface CourseMapper {
    CourseBase findCourseBaseById(String id);
}