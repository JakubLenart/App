package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        public String randomBook() throws CustomException {
            String uri = "https://openlibrary.org/dev/docs/api/books";
            return get(uri);
        }

        try {
            URL url = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder stringBuilder = new StringBuilder();

            while ((line = in.readLine()) != null) {
                stringBuilder.append(line);
            }

            in.close();

            if (stringBuilder.toString() == null || stringBuilder.toString() == "");


        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Błąd");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
