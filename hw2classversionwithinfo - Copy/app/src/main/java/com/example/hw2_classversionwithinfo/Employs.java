package com.example.hw2_classversionwithinfo;

public class Employs {
    private String names;
    private int ages;
    private int phone;
    private String job;
    private String email;
    private int pic ;

    public Employs(String names, int ages, int phone, String job, String email, int pic) {
        this.names = names;
        this.ages = ages;
        this.phone = phone;
        this.job = job;
        this.email = email;
        this.pic = pic;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
