public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero(
                "Camelo",
                150F,
                4,
                "Amarelo",
                "Terra",
                2F,
                null
                );

        Peixe tubarao = new Peixe(
                "Tubarão",
                300F,
                0,
                "Cinzento",
                "Mar",
                1.5F,
                "Barbatanas e Cauda"
        );

        Mamifero ursocanada = new Mamifero(
                "Urso-do-canadá",
                180F,
                4,
                "Vermelho",
                "Terra",
                0.5F,
                "Mel"
                );



        camelo.dados();
        tubarao.dadosPeixe();
        ursocanada.dadosMamifero();
    }
}
