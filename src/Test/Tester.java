package Test;

import address.AddressService;
import person.PersonService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Tester {
    public static void main(String[] args) {

        /*Optional<Set<String>> cityList = AddressService.getCityList(20);
        cityList.orElse(Set.of()).forEach(System.out::println);

        Optional<List<String>> streetList = AddressService.getStreetList(4);
        streetList.orElse(List.of()).forEach(System.out::println);

        PersonService.getPersonList(10).orElse(List.of()).forEach(System.out::println);
    }*/
        BigDecimal val=BigDecimal.valueOf(Double.parseDouble("0.1"));
        BigDecimal val2=new BigDecimal("0.1");
        System.out.println(val);
        System.out.println(val2);
    }
}
