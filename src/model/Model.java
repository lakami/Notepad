package model;

import java.awt.*;
import java.io.File;

public class Model {

    private Color textColorPrevious;
    private Color backroundColorPrevious;
    private String status;
    private String tekst;
    private String addressWork;
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getAddressWork() {
        return addressWork;
    }

    public void setAddressWork(String addressWork) {
        this.addressWork = addressWork;
    }

    public String getAddressHome() {
        return addressHome;
    }

    public void setAddressHome(String addressHome) {
        this.addressHome = addressHome;
    }

    public String getAddressSchool() {
        return addressSchool;
    }

    public void setAddressSchool(String addressSchool) {
        this.addressSchool = addressSchool;
    }

    private String addressHome;
    private String addressSchool;

    public Model() {
        status = "new";
        tekst = "";

    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }



    public Color getTextColorPrevious() {
        return textColorPrevious;
    }

    public void setTextColorPrevious(Color textColorPrevious) {
        this.textColorPrevious = textColorPrevious;
    }



    public Color getBackroundColorPrevious() {
        return backroundColorPrevious;
    }

    public void setBackroundColorPrevious(Color backroundColorPrevious) {
        this.backroundColorPrevious = backroundColorPrevious;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
