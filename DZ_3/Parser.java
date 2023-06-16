package HomeWorks.DZ_3;

import HomeWorks.DZ_3.Exceptions.NotCorrectBirthdayException;
import HomeWorks.DZ_3.Exceptions.NotCorrectDataException;
import HomeWorks.DZ_3.Exceptions.NotCorrectGenderFormatException;
import HomeWorks.DZ_3.Exceptions.NotCorrectNameException;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Parser {
    public static void isInputCorrect(String [] inputData){
        if (inputData.length != 6){
            throw new NotCorrectDataException();
        }
    }
    public static boolean isNameCorrect(String[] array) {
        boolean isAlphab = false;
        for (int i = 0; i < 3; i++) {
            if (isAlpha(array[i])) {
                isAlphab = true;
            } else {
                throw new NotCorrectNameException();
//                isAlphab = false;
//                return isAlphab;
            }
        }
        return isAlphab;
    }

    public static boolean isAlpha(String s) {
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public static void isPhoneCorrect(String phone){
        try {
            Integer.parseInt(phone);
        }
        catch (RuntimeException e){
            System.err.println("Не верный формат номера телефона");
        }
    }

    public static void isBirthdayCorrect(String birthday) {
        try {
            String[] birthdayArr = birthday.split("/");
            if ((Integer.parseInt(birthdayArr[0]) < 1 && Integer.parseInt(birthdayArr[0]) > 31) ||
                    (Integer.parseInt(birthdayArr[1]) < 0 && Integer.parseInt(birthdayArr[1]) > 12)) {
                throw new NotCorrectBirthdayException();
            }
        } catch (Exception e) {
            throw new NotCorrectBirthdayException();
        }
    }
    public static void isGenderCorrect(String gender){
        if (!gender.equals("f") && !gender.equals("m")){
            throw new NotCorrectGenderFormatException();
        }
    }
}





