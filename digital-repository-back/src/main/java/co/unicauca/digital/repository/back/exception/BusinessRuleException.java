package co.unicauca.digital.repository.back.exception;

public class BusinessRuleException extends BaseException{

    /**
     * Constructs a BaseException with the specified detail key message.
     *
     * @param key the detailed key message
     */
    public BusinessRuleException(String key) {
        super(key);
    }
}
