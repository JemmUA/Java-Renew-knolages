package hilelll.functionalInterface.practice1;

@FunctionalInterface
public interface CustomFunction<A, B, C, D, E> {
    E countSomething(A a, B b, C c, D d);
}
