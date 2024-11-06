package vn.edu.usth.facebook.Video;

public class VideoItem {

    String name;
    String time;
    String content;
    int avatar;
    String url;

    public VideoItem(String name, String time, String content, int avatar, String url) {
        this.name = name;
        this.time = time;
        this.content = content;
        this.avatar = avatar;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
