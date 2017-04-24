package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String line = "";
		Class richLand = RichSoilLand.class;
		Field[] allfields = richLand.getDeclaredFields();
		Field[] publicFields = richLand.getFields();

		while (!"HARVEST".equals(line = reader.readLine())){
			switch (line){
				case"private":
					for (Field allfield : allfields) {
						if(Modifier.toString(allfield.getModifiers()).equals("private")){
							System.out.println(String.format("%s %s %s",Modifier.toString(allfield.getModifiers()),
									allfield.getType().getSimpleName(),allfield.getName()));
						}
					}
					break;
				case"protected":
					for (Field allfield : allfields) {
						if(Modifier.toString(allfield.getModifiers()).equals("protected")){
							System.out.println(String.format("%s %s %s",Modifier.toString(allfield.getModifiers()),
									allfield.getType().getSimpleName(),allfield.getName()));
						}
					}
					break;
				case"public":
					for (Field publicField : publicFields) {
						int mod = publicField.getModifiers();
						System.out.println(String.format("%s %s %s",Modifier.toString(mod),
								publicField.getType().getSimpleName(),publicField.getName()));
					}
					break;
				default:
					for (Field allfield : allfields) {
						System.out.println(String.format("%s %s %s",Modifier.toString(allfield.getModifiers()),
								allfield.getType().getSimpleName(),allfield.getName()));
					}
					break;
			}
		}
	}
}
