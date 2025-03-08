import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * The Serialization class provides methods to serialize and deserialize an object.
 * @author Murugavel
 */
public class Serialization {

    /**
     * Serializes the object passes as an argument.
     * Uses ObjectOutputStream and FileOutputStream to serialize the object and write to the file
     * using writeObject() method.
     * @param car
     */
    public static void serialize(Car car){
        // issue in opening .ser extension file for me, so replaced with .txt
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("./Murugavel/Day-3-FileHandling/car-without-transient.txt"))){
            oos.writeObject(car); // serializes and writes the object into the file
        }catch (IOException e){
            System.out.println("Error occurred while writing into the file: " + e.getMessage());
        }
    }

    /**
     * Deserializes the object from the serialized binary data present inside the file.
     * Uses ObjectInputStream and FileInputStream class to deserialize the data
     * using the readObject() method.
     * @return Car
     */
    public static Car deserialize(){
        Car car = null;
        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("./Murugavel/Day-3-FileHandling/car-without-transient.txt"))){
            car = (Car) ois.readObject(); // deserializes the data present in the file
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return car;
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 200, 4, 345677);
        serialize(car);
        Car deserializedCar = deserialize();
        if(deserializedCar != null){ // checks for the validity of the deserialized object
            System.out.println(deserializedCar.getBrandName());
        }
    }
}
