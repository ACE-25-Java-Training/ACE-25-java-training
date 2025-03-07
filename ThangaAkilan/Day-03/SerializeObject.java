import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * A Project to serialize an object and deserialize it, while using a transient variable
 *
 * @author thangaakilanv
 */

public class SerializeObject {
    public static void main(String[] args) {

        Country india = new Country("Earth", "EAR91", "India", 900000000000L);

        try(FileOutputStream fileOutputStream = new FileOutputStream("india.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
            objectOutputStream.writeObject(india);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try(FileInputStream fileInputStream = new FileInputStream("india.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);){
            Country country = (Country) objectInputStream.readObject();
            System.out.printf("Country Info \n Planet : %s \n Country Id : %s \n" +
                    " Country Name : %s \n Foreign Reserve : %d",country.planetName, country.countryId,
                    country.countryName, country.foreignReserves);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}


class Country implements java.io.Serializable{
    static String planetName;
    String countryId;
    String countryName;
    transient long foreignReserves;

    Country(String planet, String id, String name, long foreignReserves){
        this.planetName = planet;
        this.countryId = id;
        this.countryName = name;
        this.foreignReserves = foreignReserves;
    }

}


