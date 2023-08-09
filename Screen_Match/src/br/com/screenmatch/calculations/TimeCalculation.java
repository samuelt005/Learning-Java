package br.com.screenmatch.calculations;

import br.com.screenmatch.models.Title;

public class TimeCalculation {
    //Atributes
    private int totalTime;

    //Other Methods
    public void sumTotalTime(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }

    //Getter Methods
    public int getTotalTime() {
        return this.totalTime;
    }
}
