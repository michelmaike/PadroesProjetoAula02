public class Cliente extends Pessoa implements Autenticavel{
    public Cliente(String nome, int idade, String endereco, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public void atualizarDados(String novoEndereco, String novoTelefone) {
        this.endereco = novoEndereco;
        this.telefone = novoTelefone;
        System.out.println("Dados atualizados");
    }

    @Override
    public void validarCadastro(){
        System.out.println("Cadastro valido: "+(email.contains("@") ?"Sim" : "Não"));
    }

    @Override
    public void login(){
        System.out.println("Cliente logou no sistema");
    }
}