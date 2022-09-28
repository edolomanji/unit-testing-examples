package com.edolomanji.domain;

import java.util.Objects;

public class Mentor {

    private String email;

    private Grade grade;

    private Intern intern;

    public boolean isFree(){
        return Objects.isNull(intern);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Intern getIntern() {
        return intern;
    }

    public void setIntern(Intern intern) {
        this.intern = intern;
    }
}
