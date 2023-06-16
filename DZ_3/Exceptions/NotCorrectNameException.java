package HomeWorks.DZ_3.Exceptions;

public class NotCorrectNameException extends RuntimeException{
    public NotCorrectNameException() {
        super("Введенное ФИО не коректно");
    }
}
