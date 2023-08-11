public class Reparo {
    //Atributos
    private int id;
    private int tamanho;
    private String localizacaoNaRua;
    private String distrito;
    private int prioridade;
    private Endereco endereco;
    private OrdemDeServico ordemDeServico;
    private Danos danos;

    //Outros métodos
    private int calculaPrioridade() {
        return this.tamanho * 10;
    }

    //Métodos Getter

    public int getId() {
        return id;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getLocalizacaoNaRua() {
        return localizacaoNaRua;
    }

    public String getDistrito() {
        return distrito;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public OrdemDeServico getOrdemDeServico() {
        return ordemDeServico;
    }

    public Danos getDanos() {
        return danos;
    }

    //Métodos Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setLocalizacaoNaRua(String localizacaoNaRua) {
        this.localizacaoNaRua = localizacaoNaRua;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setOrdemDeServico(OrdemDeServico ordemDeServico) {
        this.ordemDeServico = ordemDeServico;
    }

    public void setDanos(Danos danos) {
        this.danos = danos;
    }
}
