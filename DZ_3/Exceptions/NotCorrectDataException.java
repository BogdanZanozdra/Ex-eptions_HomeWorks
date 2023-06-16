package HomeWorks.DZ_3.Exceptions;

public class NotCorrectDataException extends RuntimeException{
    public NotCorrectDataException() {
        super("Введенные данные не соответствуют формату");
    }
}
