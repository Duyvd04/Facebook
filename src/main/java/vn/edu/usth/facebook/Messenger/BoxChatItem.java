package vn.edu.usth.facebook.Messenger;

public class BoxChatItem {

    String name;
    String content;
    int avatar;


    public BoxChatItem(String name,  String content, int avatar) {
        this.name = name;
        this.content = content;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
