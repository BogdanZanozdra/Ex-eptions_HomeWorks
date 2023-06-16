package HomeWorks.DZ_3.Exceptions;

public class NotCorrectGenderFormatException extends RuntimeException{
    public NotCorrectGenderFormatException() {
        super("Не верно указан пол");
    }
}
