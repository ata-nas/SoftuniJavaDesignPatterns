import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Singleton");
        System.out.println("<====================>");

        // Singleton example with lazy loading
        // all references below point to the same instance
        Singleton instanceSingleton = Singleton.getInstance();
        Singleton instanceSingleton1 = Singleton.getInstance();
        Singleton instanceSingleton2 = Singleton.getInstance();

        instanceSingleton.add("a");
        instanceSingleton1.add("b");
        instanceSingleton2.add("c");

        // no matter which reference is used, there is only one instance of the class
        // so updating any will update all from the perspective of the client
        // useful for many reasons, some of which are
        instanceSingleton.getDB().forEach(System.out::println);

        instanceSingleton1.remove(0);

        instanceSingleton2.getDB().forEach(System.out::println);

        System.out.println("<====================>");
        System.out.println();

        System.out.println("Builder");
        System.out.println("<====================>");

        // example of Builder Pattern with a builder for contact address for a person
        // the 2 instances below show that we can have different fields initialised
        // between different instances of the same class.
        // We can modify in the future if we want to.
        AddressBuilder address = AddressBuilder.builder()
                .withName("Georgi")
                .withEmail("georgi@gmail.com")
                .withTelephone("1234567890")
                .withStreet("main street")
                .withCity("Sofia")
                .withCountry("Bulgaria")
                .build();

        AddressBuilder address2 = AddressBuilder.builder()
                .withName("Petar")
                .withTelephone("0987654321")
                .withCity("Plovdiv")
                .build();

        System.out.println(address);

        System.out.println(address2);

        address2.setName("Dimitar");
        address2.setCountry("Bulgaria");

        System.out.println(address2);

        System.out.println("<====================>");
        System.out.println();

        System.out.println("Facade");
        System.out.println("<====================>");

        // purpose of facade is to decouple a client from implementation
        // here the Facade interface simply uses ArrayList from Collections
        // to show a simple example of that, in this case the client is not
        // interested what stands beneath the Facade, as long as it does its job
        // so changing things below and migrating should be easier
        Facade<String> facadeList = new FacadeArrayList<>();

        facadeList.add("Hi there!");
        facadeList.add("How are you!");

        facadeList.forEach(System.out::println);


        System.out.println("<====================>");
        System.out.println();
    }
}
