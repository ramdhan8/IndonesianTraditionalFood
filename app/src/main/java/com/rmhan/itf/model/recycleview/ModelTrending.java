package com.rmhan.itf.model.recycleview;



public class ModelTrending {

    int imgThumb;
    String tvPlaceName;
    String tvVote;

    public ModelTrending(int imgThumb, String tvPlaceName, String tvVote) {
        this.imgThumb = imgThumb;
        this.tvPlaceName = tvPlaceName;
        this.tvVote = tvVote;
    }

    public int getImgThumb() {
        return imgThumb;
    }

    public void setImgThumb(int imgThumb) {
        this.imgThumb = imgThumb;
    }

    public String getTvPlaceName() {
        return tvPlaceName;
    }

    public void setTvPlaceName(String tvPlaceName) {
        this.tvPlaceName = tvPlaceName;
    }

    public String getTvVote() {
        return tvVote;
    }

    public void setTvVote(String tvVote) {
        this.tvVote = tvVote;
    }
}
