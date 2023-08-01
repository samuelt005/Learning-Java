public class CharactersTest {
    public static void main(String[] args) {

        //char usado para guardar apenas um número da tabela unicode
        char letter = 'a';
        System.out.println(letter);

        char number = 1234;
        System.out.println(number);

        number = (char) (number + 1);
        System.out.println(number);

        String word = "Alura cursos online de tecnologia";
        System.out.println(word);

        word = word + 2020;
        System.out.println(word);
    }
}
