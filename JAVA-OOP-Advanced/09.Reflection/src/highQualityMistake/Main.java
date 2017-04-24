package highQualityMistake;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Class reflectionClass = Reflection.class;
        Method[] allMethods = reflectionClass.getDeclaredMethods();

        Method[] allGetters = Arrays.stream(allMethods)
                .filter(e->e.getName().startsWith("get")).toArray(Method[]::new);

        Method[] allSetters = Arrays.stream(allMethods)
                .filter(e->e.getName().startsWith("set")).toArray(Method[]::new);

        Field[]allFields = reflectionClass.getDeclaredFields();

        Arrays.sort(allFields,Comparator.comparing(Field::getName));

        for (Field allField : allFields) {
            if(!Modifier.isPrivate(allField.getModifiers())){
                System.out.println(String.format("%s must be private!",
                        allField.getName()));
            }
        }
        Arrays.sort(allGetters, Comparator.comparing(Method::getName));
        for (Method allGetter : allGetters) {
            if(!Modifier.isPublic(allGetter.getModifiers())){
                System.out.println(String.format("%s have to be public!",allGetter.getName()));
            }

        }
        Arrays.sort(allSetters, Comparator.comparing(Method::getName));
        for (Method allSetter : allSetters) {
            if(void.class.equals(allSetter.getReturnType())){
                if(allSetter.getParameterCount()==1){
                    if(!Modifier.isPrivate(allSetter.getModifiers())){
                        System.out.println(String.format("%s have to be private!",allSetter.getName()));
                    }

                }

            }

        }


    }
}
