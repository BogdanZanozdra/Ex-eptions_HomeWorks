package HomeWorks.DZ_3.Exceptions;

public class NotCorrectBirthdayException extends RuntimeException{
    public NotCorrectBirthdayException() {
        super("Не верный формат даты рождения");
    }
}
