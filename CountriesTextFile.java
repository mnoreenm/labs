    import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
	import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
	import java.io.PrintWriter;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.ArrayList;
	import java.util.List;

	/**
	 * Responsible for reading and writing countries to a file.
	 */
	public class CountriesTextFile {
		
		/**
		 * The path of the file where countries  are stored.
		 */
		private Path filePath;
		
		/**
		 * Constructor that lets you choose a file path.
		 * 
		 * @param filePathString path of the file where trucks are stored.
		 */
		public CountriesTextFile(String filePathString) {
			this.filePath = Paths.get(filePathString);
		}
		
		/**
		 * Constructor that uses the default file path to store countries.
		 */
		public CountriesTextFile() {
			this("C:/Users/Administrator/workspace/Labs/src/countries.txt");
		}
		
		/**
		 * Read the file and returns all the countries listed in the file.
		 * 
		 * @return A List of countries. If not file exists, it returns an empty list.
		 * @throws RuntimeException if something goes wrong while accessing the file.
		 */
		public List<String> readCountryList() {
			List<String> countries = new ArrayList<>();
			if (!Files.exists(filePath)) {
				return countries;
			}
			
			try {
				File file = filePath.toFile();
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);
			 
				String line = reader.readLine();
				while (line != null) {
					countries.add(line);
					line = reader.readLine();
				}
				
				reader.close();
				return countries;
			} catch (IOException ex) {
				throw new RuntimeException("Unable to read countries.", ex);
			}
		}
		
		/**
		 * Writes a list of countries to the file.
		 * 
		 * @param countryList The list of countries to write.
		 * @throws RuntimeException if something goes wrong while accessing the file
		 */
		public void writeCountryList(List<String> countries) {
			try {
				if (!Files.exists(filePath)) {
					Files.createFile(filePath);
				}
				
				File file = filePath.toFile();
				PrintWriter writer = new PrintWriter(
				                     new BufferedWriter(
				                     new FileWriter(file,true)));
				 
				
				for (String country : countries) {
					writer.println(country);
				}
				
				writer.close();
			} catch (IOException ex) { // IOException is a checked exception (I have to handle it)
				// RuntimeException is an unchecked exception (I don't have to handle it)
				throw new RuntimeException("Unable to save countries", ex);
			}
		}

	}