package Strings;
public class Defanging_an_IP_Address {
    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (char c : address.toCharArray()){
            str.append((c == '.')? "[.]" : c );
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String address = "191.0. 1.2.";
        System.out.println(defangIPaddr(address));
    }
}