public class OrdemDeServico {
    //Atributos
    private String localizacao;
    private double tamanho;
    private int idEquipe;
    private int tamanhoEquipe;
    private String equipamento;
    private int horasAplicadas;
    private String estado;
    //TODO Alterar para -> trabalho em andamento, reparado, reparo temporário, não reparado)
    private double quantidadeMaterialEnchimento;
    private double custoReparo;

    //Construtor
    public OrdemDeServico(String localizacao, double tamanho, int idEquipe, int tamanhoEquipe, String equipamento, int horasAplicadas, String estado, double quantidadeMaterialEnchimento, double custoReparo) {
        this.localizacao = localizacao;
        this.tamanho = tamanho;
        this.idEquipe = idEquipe;
        this.tamanhoEquipe = tamanhoEquipe;
        this.equipamento = equipamento;
        this.horasAplicadas = horasAplicadas;
        this.estado = estado;
        this.quantidadeMaterialEnchimento = quantidadeMaterialEnchimento;
        this.custoReparo = custoReparo;
    }
}
