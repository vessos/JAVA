package pr02PrivateClassFiddling;

import org.omg.CORBA.Object;
import pr02PrivateClassFiddling.com.peshoslav.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, NoSuchFieldException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String line = "";
		Class blackBox = BlackBoxInt.class;
		Constructor[] declaredConstructors = blackBox.getDeclaredConstructors();
		BlackBoxInt cons =null;
		for (Constructor declaredConstructor : declaredConstructors) {
			if(declaredConstructor.getParameterCount()==0){
				declaredConstructor.setAccessible(true);
				cons= (BlackBoxInt) declaredConstructor.newInstance();
			}
		}
		Field field = blackBox.getDeclaredField("innerValue");
		field.setAccessible(true);
		while(!"END".equals(line = reader.readLine())){

			String[] input = line.split("_");
			String command = input[0];
			int value = Integer.valueOf(input[1]);
			switch (command){
				case"add":
					Method method = blackBox.getDeclaredMethod("add",int.class);
					method.setAccessible(true);
					method.invoke(cons,value);
					System.out.println(field.getInt(cons));
					break;
				case"subtract":
					Method method1 = blackBox.getDeclaredMethod("subtract",int.class);
					method1.setAccessible(true);
					method1.invoke(cons,value);
					System.out.println(field.getInt(cons));
					break;
				case"divide":
					Method method2 = blackBox.getDeclaredMethod("divide",int.class);
					method2.setAccessible(true);
					method2.invoke(cons,value);
					System.out.println(field.getInt(cons));
					break;
				case"multiply":
					Method method3 = blackBox.getDeclaredMethod("multiply",int.class);
					method3.setAccessible(true);
					method3.invoke(cons,value);
					System.out.println(field.getInt(cons));
					break;
				case"rightShift":
					Method method4 = blackBox.getDeclaredMethod("rightShift",int.class);
					method4.setAccessible(true);
					method4.invoke(cons,value);
					System.out.println(field.getInt(cons));
					break;
				case"leftShift":
					Method method5 = blackBox.getDeclaredMethod("leftShift",int.class);
					method5.setAccessible(true);
					method5.invoke(cons,value);
					System.out.println(field.getInt(cons));
					break;
			}
		}
	}
}
