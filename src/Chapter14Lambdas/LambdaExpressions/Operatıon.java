package Chapter14Lambdas.LambdaExpressions;


@FunctionalInterface
public interface Operatıon<T> {

    T operate(T value1, T value2);

}
