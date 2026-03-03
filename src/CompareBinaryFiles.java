import java.io.*;

class CompareBinaryFiles {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("Public");
            FileInputStream f2 = new FileInputStream("Public");

            int b1, b2;
            int position = 1;
            boolean equal = true;

            while (true) {
                b1 = f1.read();
                b2 = f2.read();

                if (b1 != b2) {
                    equal = false;
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    break;
                }

                if (b1 == -1 || b2 == -1)
                    break;

                position++;
            }

            if (equal) {
                System.out.println("Two files are equal");
            }

            f1.close();
            f2.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}