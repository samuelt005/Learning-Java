package br.com.screenmatch.main;

import br.com.screenmatch.exceptions.ConversionException;
import br.com.screenmatch.models.OmdbTitle;
import br.com.screenmatch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String search = "";
        List<Title> titleList = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca:");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("sair")) {
                break;
            }

            String url = "http://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=3a543ae1";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                OmdbTitle omdbTitle = gson.fromJson(json, OmdbTitle.class);
                System.out.println(omdbTitle);

                Title title = new Title(omdbTitle);
                System.out.println("Título convertido");
                System.out.println(title);

                titleList.add(title);

            } catch (NumberFormatException e) {
                System.out.println("Houve o erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro na busca, verifique o endereço!");
            } catch (ConversionException e) {
                System.out.println(e.getMenssage());
            }

        }
        System.out.println(titleList);

        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(titleList));
        writer.close();

        System.out.println("Programa finalizou corretamente!");
    }
}
