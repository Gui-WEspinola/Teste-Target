package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class QuartaQuestao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Map<String, Double> mapaFaturamento = new HashMap<>();
        mapaFaturamento.put("SP", 67836.43);
        mapaFaturamento.put("RJ", 36678.66);
        mapaFaturamento.put("MG", 29229.88);
        mapaFaturamento.put("ES", 27165.48);
        mapaFaturamento.put("Outros", 19849.53);

        final Double[] valorTotal = {0.0};

        mapaFaturamento.forEach((k, v) -> {
            valorTotal[0] += Double.parseDouble(String.valueOf(v));
        });

        System.out.println("Valor total: " + valorTotal[0]);

        mapaFaturamento.forEach((k, v) -> {
            String chave = String.valueOf(k);
            Double valor = Double.parseDouble(String.valueOf(v));
            System.out.printf("Percentual do Estado de %s: %.2f%n", chave, calcularPercentual(valorTotal[0], valor));
        });
    }

    private static Double calcularPercentual(Double valorTotal, Double valorPorEstado) {
        return (valorPorEstado * 100) / valorTotal;
    }
}
