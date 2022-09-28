package com.edolomanji.domain;

public class Intern {

    private String email;

    private Mentor mentor;

    public Intern(String email) {
        this.email = email;
    }

    public Intern(String email, Mentor mentor) {
        this.email = email;
        this.mentor = mentor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }



}
