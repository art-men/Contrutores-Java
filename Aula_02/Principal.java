public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        System.out.println("Dono");

        pessoa1.nome = "João";
        pessoa1.cpf = "123.456.789-10";
        pessoa1.idade = 27;

        Pessoa pessoa2 = new Pessoa("Maria",29,"789.456.123-10");

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("CPF: " + pessoa1.cpf);

        System.out.println("");

//        System.out.println("Nome: " + pessoa2.nome);
//        System.out.println("Idade: " + pessoa2.idade);
//        System.out.println("CPF: " + pessoa2.cpf);
//
        Cao cao1 = new Cao();

        cao1.nome = "Jurandir";
        cao1.raca = "Vira-Lata";
        cao1.idade = 67;
        cao1.porte = "Gigante";
        cao1.tipoPelo = "~ quase não tem";
        cao1.sexo = "Masculino";
        cao1.vacinado = true;

        System.out.println("Doguin");

        System.out.println("Nome: " + cao1.nome);
        System.out.println("Raca: " + cao1.raca);
        System.out.println("Idade: " + cao1.idade);
        System.out.println("Porte: " + cao1.porte);
        System.out.println("Tipo do pelo: " + cao1.tipoPelo);
        System.out.println("Sexo: " + cao1.sexo);
        System.out.println("Vacinado: " + cao1.vacinado);

    }

}
