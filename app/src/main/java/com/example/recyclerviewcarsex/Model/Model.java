package com.example.recyclerviewcarsex.Model;

public class Model {
    int carimage;
    String carName;

    public Model(int carimage, String carName) {
        this.carimage = carimage;
        this.carName = carName;
    }

    public int getCarimage() {
        return carimage;
    }

    public void setCarimage(int carimage) {
        this.carimage = carimage;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
