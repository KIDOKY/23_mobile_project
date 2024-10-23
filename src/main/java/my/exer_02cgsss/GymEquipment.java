package my.exer_02cgsss;

public class GymEquipment {
    private String name;
    private String status;
    private int imageResId;

    public GymEquipment(String name, String status) {
        this.name = name;
        this.status = status;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public int getImageResId() { return imageResId; }

    public void cancelReservation() {
        status = "사용할 수 있음";
    }
}
