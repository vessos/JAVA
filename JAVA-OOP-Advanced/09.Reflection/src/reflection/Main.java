package reflection;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class reflectionClass = Reflection.class;
        System.out.println(reflectionClass);
        Class parentClass = reflectionClass.getSuperclass();
        System.out.println(parentClass);
        Class[] interfaces = reflectionClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
        Reflection reflection = (Reflection) reflectionClass.newInstance();
        System.out.println(reflection);
    }
}
