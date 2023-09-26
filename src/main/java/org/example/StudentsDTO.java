package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StudentsDTO {

    @JsonProperty("students")
    private List<StudentDTO> students;

    public List<StudentDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }
}
