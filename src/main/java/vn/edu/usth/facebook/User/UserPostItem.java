package vn.edu.usth.facebook.User;

public class UserPostItem {

    String name;
    String time;
    String content;
    int avatar;
    int postimage;

    public UserPostItem(String name, String time, String content, int avatar, int postimage) {
        this.name = name;
        this.time = time;
        this.content = content;
        this.avatar = avatar;
        this.postimage = postimage;
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

    public int getPostimage() {
        return postimage;
    }

    public void setPostimage(int postimage) {
        this.postimage = postimage;
    }
}
