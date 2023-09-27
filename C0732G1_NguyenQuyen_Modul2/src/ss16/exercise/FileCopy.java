package ss16.exercise;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
public class FileCopy {
    public static void main(String[] args) {
        String sourcePath= "/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/ss16/exercise/source.txt";
        String destPath= "/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/ss16/exercise/target.txt";
        try {
            copyFile(sourcePath, destPath);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }

    public static void copyFile(String sourceFilePath, String targetFilePath) throws IOException {
        Path sourcePath = Path.of(sourceFilePath);
        Path targetPath = Path.of(targetFilePath);

        if (!Files.exists(sourcePath)) {
            System.out.println("File not found");
            return;
        }

        if (Files.exists(targetPath)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("This file already exists. Do you want to overwrite it? (yes/no)");
            String confirm = scanner.nextLine();
            if (confirm.equals("yes")) {
                Files.delete(targetPath);
            } else {
                return;
            }
        }

        Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("Successful cloning");
        System.out.println("Number of cloned characters: " + Files.size(sourcePath));
    }
    }

