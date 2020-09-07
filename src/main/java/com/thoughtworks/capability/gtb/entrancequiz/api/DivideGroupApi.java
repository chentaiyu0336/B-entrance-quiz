package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class DivideGroupApi {

    static List<Student> studentList= Arrays.asList(
            new Student(1,"沈乐棋"),
            new Student(2,"徐慧慧"),
            new Student(3,"陈思聪"),
            new Student(4,"王江林"),
            new Student(5,"王登宇"),
            new Student(6,"杨思雨"),
            new Student(7,"江雨舟"),
            new Student(8,"廖燊"),
            new Student(9,"胡晓"),
            new Student(10,"但杰"),
            new Student(11,"盖迈达"),
            new Student(12,"肖美琦"),
            new Student(13,"黄云洁"),
            new Student(14,"齐瑾浩"),
            new Student(15,"刘亮亮"),
            new Student(16,"肖逸凡"),
            new Student(17,"王作文"),
            new Student(18,"郭瑞凌"),
            new Student(19,"李明豪"),
            new Student(20,"党泽"),
            new Student(21,"肖伊佐"),
            new Student(22,"贠晨曦"),
            new Student(23,"李康宁"),
            new Student(24,"马庆"),
            new Student(25,"商婕"),
            new Student(26,"余榕"),
            new Student(27,"谌哲"),
            new Student(28,"董翔锐"),
            new Student(29,"陈泰宇"),
            new Student(30,"赵允齐"),
            new Student(31,"张柯"),
            new Student(32,"廖文强"),
            new Student(33,"刘轲"),
            new Student(34,"廖浚斌"),
            new Student(35,"凌凤仪")
    );

    @PostMapping("/student/add")
    public List<Student> addStudentToList(@RequestBody String name){
        Integer id = studentList.size()+1;
        studentList.add(new Student(id,name));
        return studentList;
    }

    @GetMapping("/student")
    public List<Student> getStudentList(){
        return studentList;
    }
}
