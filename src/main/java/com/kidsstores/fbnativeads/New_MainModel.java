package com.kidsstores.fbnativeads;

public class New_MainModel {

    private  String Title;
    private  String Time;
    private  String Views;
    private  String Links;
    private int Images;

    public New_MainModel(String title, String time, String views, String links, int images) {
        Title = title;
        Time = time;
        Views = views;
        Links = links;
        Images = images;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getViews() {
        return Views;
    }

    public void setViews(String views) {
        Views = views;
    }

    public String getLinks() {
        return Links;
    }

    public void setLinks(String links) {
        Links = links;
    }

    public int getImages() {
        return Images;
    }

    public void setImages(int images) {
        Images = images;
    }
}
