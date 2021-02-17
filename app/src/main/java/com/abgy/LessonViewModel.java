package com.abgy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LessonViewModel extends ViewModel {

    MutableLiveData<String> subject = new MutableLiveData<>();
    MutableLiveData<String> teacher = new MutableLiveData<>();
    MutableLiveData<String> students = new MutableLiveData<>();

    public LiveData<String> getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher.setValue(teacher);
    }

    public LiveData<String> getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students.setValue(students);
    }

    public LiveData<String> getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject.setValue(subject);
    }
}
