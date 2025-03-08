import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private String brandName;
    private int maxSpeed;
    private int seatingCapacity;
    private transient int secreteCode;

    public Car(String brandName, int maxSpeed, int seatingCapacity, int secreteCode){
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
        this.seatingCapacity = seatingCapacity;
        this.secreteCode = secreteCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getSecreteCode() {
        return secreteCode;
    }

    public void setSecreteCode(int secreteCode) {
        this.secreteCode = secreteCode;
    }
}
