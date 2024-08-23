package Set_1.Problem_1;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.Base64;
import java.util.HexFormat;

public class HexToBase64Converter {
    private static String convertHexToBase64(String hexString) throws UnsupportedEncodingException {
        byte[] hexBytes = HexFormat.of().parseHex(hexString);
        byte[] base64Bytes = Base64.getEncoder().encode(hexBytes);
        return new String(base64Bytes, "UTF-8");
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("Enter Hex Value:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(convertHexToBase64(input));
    }
}
