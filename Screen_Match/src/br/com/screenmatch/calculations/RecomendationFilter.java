package br.com.screenmatch.calculations;

public class RecomendationFilter {

    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
