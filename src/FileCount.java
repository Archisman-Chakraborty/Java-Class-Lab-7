import java.io.*;
import java.util.Scanner;

class FileCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter file name: ");
            String filename = sc.nextLine();

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            int characters = 0;
            int words = 0;
            int lines = 0;
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] wordList = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordList.length;
                }
            }

            System.out.println("No. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        sc.close();
    }
}