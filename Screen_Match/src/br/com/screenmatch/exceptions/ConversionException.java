package br.com.screenmatch.exceptions;

public class ConversionException extends RuntimeException {
    private String menssage;
    public ConversionException(String menssage) {
        this.menssage = menssage;
    }

    public String getMenssage() {
        return this.menssage;
    }
}
