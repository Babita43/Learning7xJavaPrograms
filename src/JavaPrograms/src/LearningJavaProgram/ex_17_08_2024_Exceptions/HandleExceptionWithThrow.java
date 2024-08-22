package JavaPrograms.src.LearningJavaProgram.ex_17_08_2024_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleExceptionWithThrow {
    public static void main(String[] args) throws FileNotFoundException {
        ReadFile();
    }
    public static void ReadFile() throws FileNotFoundException {
        String path = "c:/File.txt";
        File file = new File(path);
        FileReader fr = new FileReader(file);
    }
}
