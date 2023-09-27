package ss16.exercise.exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MainCountries {
    public static void main(String[] args) {
        Path path = Path.of("/Users/nguyentatquyen/Documents/GitHub/C0723G1_Nguyen_Tat_Quyen/C0732G1_NguyenQuyen_Modul2/src/ss16/exercise/exercise2/data.csv");
        String line;
        String splitBy = ",";
        try {
            File file = new File(path + "data.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                String[] location = line.split(splitBy);
                System.out.println("Location [ID = " + location[0] + ", Code = " + location[1] + ", Name= " + location[2] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
