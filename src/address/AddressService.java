package address;

import java.util.*;
import java.util.stream.Collectors;

public class AddressService {
    private static final int MAX_NUMBER_OF_ADDRESS = 50;
    private static final int MAX_NUMBER_OF_CITY = 16;

    public static Optional<List<Address>> getAddressList(int addressCount) {
        if (addressCount > MAX_NUMBER_OF_ADDRESS) return Optional.empty();
        List<Address> addressList = new ArrayList<>();
        for (int i = 0; i < addressCount; i++) {
            addressList.add(Address.builder()
                    .id(Integer.parseInt(ADDRESS_DATA[i][0]))
                    .street(ADDRESS_DATA[i][1])
                    .city(ADDRESS_DATA[i][2])
                    .state(ADDRESS_DATA[i][3])
                    .country(ADDRESS_DATA[i][4])
                    .pincode(ADDRESS_DATA[i][5])
                    .build());
        }
        return Optional.of(addressList);
    }

    public static Optional<List<String>> getStreetList(int streetCount) {
        if (streetCount > MAX_NUMBER_OF_ADDRESS) return Optional.empty();
        List<String> streetList = new ArrayList<>();
        for (int i = 0; i < streetCount; i++) {
            streetList.add(ADDRESS_DATA[i][1]);
        }
        return Optional.of(streetList);
    }

    public static Optional<Set<String>> getCityList(int cityCount) {
        if (cityCount > MAX_NUMBER_OF_CITY) return Optional.empty();
        Set<String> streetList = new TreeSet<>();
        for (int i = 0; i < MAX_NUMBER_OF_ADDRESS; i++) {
            streetList.add(ADDRESS_DATA[i][2]);
        }
        return Optional.of(streetList.stream().limit(cityCount).collect(Collectors.toSet()));
    }

    private static final String[][] ADDRESS_DATA = {
            {"1", "1, MG Road", "Bangalore", "Karnataka", "India", "560001"},
            {"2", "2, Connaught Place", "Delhi", "Delhi", "India", "110001"},
            {"3", "3, Marine Drive", "Mumbai", "Maharashtra", "India", "400002"},
            {"4", "4, Raj Bhavan Road", "Hyderabad", "Telangana", "India", "500001"},
            {"5", "5, M.G. Marg", "Lucknow", "Uttar Pradesh", "India", "226001"},
            {"6", "6, Vastrapur", "Ahmedabad", "Gujarat", "India", "380015"},
            {"7", "7, Kharadi", "Pune", "Maharashtra", "India", "411014"},
            {"8", "8, Jayanagar", "Bangalore", "Karnataka", "India", "560011"},
            {"9", "9, Banjara Hills", "Hyderabad", "Telangana", "India", "500034"},
            {"10", "10, Churchgate", "Mumbai", "Maharashtra", "India", "400020"},
            {"11", "11, Ashoka Road", "Delhi", "Delhi", "India", "110001"},
            {"12", "12, Brigade Road", "Bangalore", "Karnataka", "India", "560025"},
            {"13", "13, Nungambakkam", "Chennai", "Tamil Nadu", "India", "600034"},
            {"14", "14, Sector 17", "Chandigarh", "Chandigarh", "India", "160017"},
            {"15", "15, Marine Lines", "Mumbai", "Maharashtra", "India", "400020"},
            {"16", "16, Vasant Kunj", "Delhi", "Delhi", "India", "110070"},
            {"17", "17, Bhopal", "Bhopal", "Madhya Pradesh", "India", "462001"},
            {"18", "18, Salt Lake", "Kolkata", "West Bengal", "India", "700091"},
            {"19", "19, Dadar", "Mumbai", "Maharashtra", "India", "400014"},
            {"20", "20, Dlf Phase 1", "Gurgaon", "Haryana", "India", "122002"},
            {"21", "21, MG Road", "Gurgaon", "Haryana", "India", "122018"},
            {"22", "22, Saket", "Delhi", "Delhi", "India", "110017"},
            {"23", "23, Connaught Place", "Delhi", "Delhi", "India", "110001"},
            {"24", "24, Andheri West", "Mumbai", "Maharashtra", "India", "400053"},
            {"25", "25, Malad East", "Mumbai", "Maharashtra", "India", "400097"},
            {"26", "26, Koramangala", "Bangalore", "Karnataka", "India", "560034"},
            {"27", "27, Brigade Road", "Bangalore", "Karnataka", "India", "560001"},
            {"28", "28, Juhu", "Mumbai", "Maharashtra", "India", "400049"},
            {"29", "29, Kottayam", "Kottayam", "Kerala", "India", "686001"},
            {"30", "30, Malleswaram", "Bangalore", "Karnataka", "India", "560003"},
            {"31", "31, M.G. Road", "Indore", "Madhya Pradesh", "India", "452001"},
            {"32", "32, Bhopal", "Bhopal", "Madhya Pradesh", "India", "462002"},
            {"33", "33, Vasant Vihar", "Delhi", "Delhi", "India", "110057"},
            {"34", "34, Kharghar", "Navi Mumbai", "Maharashtra", "India", "410210"},
            {"35", "35, Marine Drive", "Mumbai", "Maharashtra", "India", "400002"},
            {"36", "36, M.G. Road", "Nashik", "Maharashtra", "India", "422001"},
            {"37", "37, Sion", "Mumbai", "Maharashtra", "India", "400022"},
            {"38", "38, BTM Layout", "Bangalore", "Karnataka", "India", "560076"},
            {"39", "39, M.G. Road", "Pune", "Maharashtra", "India", "411001"},
            {"40", "40, Jayanagar", "Bangalore", "Karnataka", "India", "560011"},
            {"41", "41, Indira Nagar", "Bangalore", "Karnataka", "India", "560038"},
            {"42", "42, Hiranandani", "Mumbai", "Maharashtra", "India", "400076"},
            {"43", "43, Cuffe Parade", "Mumbai", "Maharashtra", "India", "400005"},
            {"44", "44, Andheri East", "Mumbai", "Maharashtra", "India", "400069"},
            {"45", "45, Koramangala", "Bangalore", "Karnataka", "India", "560034"},
            {"46", "46, Saket", "Delhi", "Delhi", "India", "110017"},
            {"47", "47, Vashi", "Navi Mumbai", "Maharashtra", "India", "400703"},
            {"48", "48, J.P. Nagar", "Bangalore", "Karnataka", "India", "560078"},
            {"49", "49, Banshankari", "Bangalore", "Karnataka", "India", "560070"},
            {"50", "50, Powai", "Mumbai", "Maharashtra", "India", "400076"}
    };

}
