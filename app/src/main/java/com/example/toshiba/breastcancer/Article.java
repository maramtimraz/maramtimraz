package com.example.toshiba.breastcancer;

public class Article {
    private   String title;
    private   int image;
    private   String url;

    public Article(String title, int image ,String url) {
        this.title = title;
        this.image = image;
        this.url=url;
    }


    public String getUrl() {
        return url;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }




}
