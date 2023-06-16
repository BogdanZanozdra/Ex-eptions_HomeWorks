package HomeWorks.DZ_3;


import HomeWorks.DZ_3.Exceptions.NotCorrectDataException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

import static HomeWorks.DZ_3.Parser.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите ФИО, дату рождения, номер телефона и пол через пробел в формате:\nIvanov Ivan Ivanovich dd/mm/yyyy 81112223344 m");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] inputArray = inputString.split(" ");

        isInputCorrect(inputArray);
        isNameCorrect(inputArray);
        isBirthdayCorrect(inputArray[3]);
        isPhoneCorrect(inputArray[4]);
        isGenderCorrect(inputArray[5]);
        writeData(inputString, inputArray[0]);
    }
    public static void writeData(String inputStr, String pathWrite) throws IOException{
        try (FileWriter writer = new FileWriter(new File(pathWrite), true);)
        {
            if (!Files.exists(Path.of(inputStr))){
                writer.write(String.format("\n" + inputStr));
            } else {
                writer.write(inputStr);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
