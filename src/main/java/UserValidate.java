/**
 *
 * @author Sri Lakshmi Prasanna
 *
 * @functional Interface <T>
 */
@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T param);
}
