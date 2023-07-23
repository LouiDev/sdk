package de.louidev.sdk.simplefileeditor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SimpleFileEditor {

	public static void write(String filePath, String content) {
		try {

			BufferedWriter bWriter = new BufferedWriter(new FileWriter(filePath));
			bWriter.write(content);
			bWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static <O extends Serializable> void writeObject(String filePath, O object) {
		try {

			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object);
			oos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object readObject(String filePath) {
		Object o = null;

		try {

			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			o = ois.readObject();
			ois.close();
			fis.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return o;
	}

	public static String readAll(String filePath) {
		StringBuilder sb = new StringBuilder();

		try {

			BufferedReader bReader = new BufferedReader(new FileReader(filePath));

			String line;
			while ((line = bReader.readLine()) != null) {
				sb.append(line);
			}

			bReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}

}
