package com.oop.mahadi.demo1comnum;

public class DemoCl {

    String rea,img;

    public String getRea() {
        return rea;
    }

    public void setRea(String rea) {
        this.rea = rea;
    }

    public String getImg() {
        return img+"i";
    }

    public void setImg(String img) {
        this.img = img;
    }

    public DemoCl(String rea, String img) {
        this.rea = rea;
        this.img = img;
    }
}
