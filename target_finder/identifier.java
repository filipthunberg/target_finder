

import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class identifier {

	public static void main(String[] args) {

		try {
			File file = new File("sma_gentext.xml");

			Scanner input = new Scanner(file);

			int number = 4;


			String the_id = "42007"; // The given id

			trans_unit the_unit = new trans_unit("", "", "");

			trans_unit[] units = new trans_unit[number];

			String found = "<trans-unit";

			for (int i = 0; i < number ; i++ ) {

				while(found.equals(input.next()) == false) {}

				String id = input.next().toString();
				input.next();
				String source = input.next().toString();
				String target = input.next().toString();

				trans_unit unit = new trans_unit(id, source, target);

				units[i] = unit;

				if(the_id.equals(units[i].toString().substring(8, 13))) {
					the_unit = new trans_unit(id, source, target);
				}

				}

			String id_target = the_unit.toString().substring(the_unit.toString().lastIndexOf("Target"));

			FileWriter myObj = new FileWriter("42007.txt");
		      myObj.write(id_target);
		      myObj.close();

		}

		catch (IOException e) {
		      System.out.println("An error occurred.");
		    }

	}

}
