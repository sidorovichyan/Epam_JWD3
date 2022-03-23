package by.tc.task01.exeption;

public class IncorrectSearchCriteriaExeption extends Exception{

    public IncorrectSearchCriteriaExeption() {
        super();
    }

    public IncorrectSearchCriteriaExeption(String message) {
        super(message);
    }

    public IncorrectSearchCriteriaExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectSearchCriteriaExeption(Throwable cause) {
        super(cause);
    }
}
