package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class StudentDataSource
{

    private static StudentDataSource instance=null;
    private List<student> students=new ArrayList<>(10);
    private StudentDataSource()
    {
        student student=new student();
        student.id=1896640;
        student.name="hii";
        student.password="password";
        this.students.add(student);
    }
    public static StudentDataSource getInstance()
    {
        if(instance==null)
        {
            instance=new StudentDataSource();
        }
    return instance;
    }
    public void addStudent(student student)
    {
        this.students.add(student);
    }

    public List<student> getStudents() {
        return this.students;
    }
}
