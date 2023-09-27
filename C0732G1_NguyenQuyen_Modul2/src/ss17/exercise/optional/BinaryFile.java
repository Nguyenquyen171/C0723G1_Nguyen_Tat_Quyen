package ss17.exercise.optional;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
public class BinaryFile {
        public static void main(String[] args) {
            String sourcePath = "/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/ss17/exercise/optional/source.txt";
            String destPath = "/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/ss17/exercise/optional/dest.txtt";

            try {
                copyFileUsingStream(sourcePath, destPath);

                System.out.println("File copied successfully!");
            } catch (IOException e) {
                System.out.println("An error occurred while copying the file.");
                e.printStackTrace();
            }
        }

        public static void copyFileUsingStream(String sourcePath, String destPath) throws IOException {
            File sourceFile = new File(sourcePath);
            File destFile = new File(destPath);

            try (InputStream inputStream = new FileInputStream(sourceFile);
                 OutputStream outputStream = new FileOutputStream(destFile)) {

                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }
            }
        }

        public static void copyFileUsingJava8Files(String sourcePath, String destPath) throws IOException {
            Path source = Path.of(sourcePath);
            Path dest = Path.of(destPath);

            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        }

}
