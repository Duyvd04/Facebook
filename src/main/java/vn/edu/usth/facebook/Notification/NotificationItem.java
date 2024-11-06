package vn.edu.usth.facebook.Notification;

public class NotificationItem {
    String name;
    String time;
    int avatar;

    public NotificationItem(String name, String time, int avatar) {
        this.name = name;
        this.time = time;
        this.avatar = avatar;
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

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

}
