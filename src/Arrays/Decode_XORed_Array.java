package Arrays;
public class Decode_XORed_Array {
    public static int[] decode(int[] encoded, int first) {
        var decoded = new int[encoded.length + 1];
        decoded[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            decoded[i + 1] = decoded[i] ^ encoded[i];
        }
        return decoded;
    }

    public static void main(String[] args) {
        int[] encoded = {1, 2, 3};
        int first = 1;
        int[] decoded = decode(encoded, first);
        for (int i : decoded)
            System.out.print(i + " ");
    }
}
