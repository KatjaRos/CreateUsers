package com.example.createusers;

public class UserInformation {
    protected String fname;
    protected String lname;
    protected String email;
    protected String program;

    public UserInformation (String fname, String lname, String email, String program) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.program = program;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getProgram() {
        return program;
    }
}
