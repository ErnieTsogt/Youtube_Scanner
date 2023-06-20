package team.jndk.praktyki.model;

public class Video {
    private String title;
    private String id;
    private int views;
    private int likes;
    private int comments;
    private String scannedDate;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }
    public int getViews(){
        return views;
    }

    public void setViews(int views){
        this.views=views;
    }
    public int getLikes(){
        return likes;
    }

    public void setLikes(int likes){
        this.likes=likes;
    }
    public int getComments(){
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }
    public String getScannedDate(){
        return scannedDate;
    }

    public void setScannedDate(String scannedDate){
        this.scannedDate=scannedDate;
    }
}
