package application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Faturamento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TerceiraQuestao {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        StringBuilder json = new StringBuilder();
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader("json/dados.json"))) {

            while ((line = reader.readLine()) != null) {
                json.append(line);
            }

        } catch (IOException ex) {
            ex.getMessage();
        }

        try {
            Faturamento[] faturamentos = mapper.readValue(json.toString(), Faturamento[].class);

            Double menorValor = faturamentos[0].getValor();
            Double maiorValor = 0.0;
            Double valorTotal = 0.0;
            int contagemDiasValidos = 0;

            for (Faturamento faturamento : faturamentos) {
                if (faturamento.getValor() != 0.0) {
                    menorValor = menorValor > faturamento.getValor() ? faturamento.getValor() : menorValor;
                    maiorValor = maiorValor < faturamento.getValor() ? faturamento.getValor() : maiorValor;
                    valorTotal += faturamento.getValor();
                    contagemDiasValidos++;
                }
            }

            System.out.printf("Valor total faturado em %d dias: %.2f%n", contagemDiasValidos, valorTotal);
            System.out.printf("Menor valor diário: %.2f%n", menorValor);
            System.out.printf("Maior valor diário: %.2f%n", maiorValor);

        } catch (JsonProcessingException ex) {
            ex.getMessage();
        }
    }
}
