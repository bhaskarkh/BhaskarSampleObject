package person;

import address.Address;
import address.AddressService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonService {

    public static Optional<List<Person>> getPersonList(int totalCountOfPerson) {
        List<Person> personList = new ArrayList<>();

        // Get address list from AddressService
        Optional<List<Address>> addressListOpt = AddressService.getAddressList(totalCountOfPerson);

        // Check if address list is present
        if (addressListOpt.isPresent()) {
            List<Address> addressList = addressListOpt.orElseGet(ArrayList::new);
            // Populate person list with person data and associated addresses
            for (int i = 0; i < totalCountOfPerson && i < PERSON_DATA.length; i++) {
                Address address = addressList.get(i);

                Person person = Person.builder()
                        .id(Integer.parseInt(PERSON_DATA[i][0]))
                        .firstName(PERSON_DATA[i][1])
                        .lastName(PERSON_DATA[i][2])
                        .age(Integer.parseInt(PERSON_DATA[i][3]))
                        .address(address)
                        .build();

                personList.add(person);
            }
        }
        return Optional.of(personList);
    }


    private static final String[][] PERSON_DATA = {
            {"101", "John", "Doe", "30"},
            {"102", "Jane", "Smith", "28"},
            {"103", "Michael", "Johnson", "35"},
            {"104", "Emily", "Davis", "32"},
            {"105", "David", "Wilson", "40"},
            {"106", "Sophia", "Martinez", "25"},
            {"107", "James", "Brown", "27"},
            {"108", "Olivia", "Garcia", "29"},
            {"109", "Liam", "Anderson", "31"},
            {"110", "Charlotte", "Thomas", "33"},
            {"111", "Jacob", "Moore", "34"},
            {"112", "Amelia", "Taylor", "26"},
            {"113", "Daniel", "Hernandez", "36"},
            {"114", "Mia", "Lopez", "24"},
            {"115", "Ethan", "Gonzalez", "38"},
            {"116", "Ava", "Clark", "27"},
            {"117", "Alexander", "Lewis", "30"},
            {"118", "Sophia", "Walker", "22"},
            {"119", "Benjamin", "Hall", "39"},
            {"120", "Isabella", "Young", "33"}
    };


}
