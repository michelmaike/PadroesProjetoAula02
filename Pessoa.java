public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String endereco;
    protected String telefone;
    protected String email;

    public void mostrarDadosBasicos(){
        System.out.println("Nome: "+nome);
        System.out.println("idade: "+idade);
    }
    
    public void mostrarContato(){
        System.out.println("Telefone: "+telefone);
        System.out.println("Email: "+email);
    }
    
    public void exibirEndereco(){
        System.out.println("Endereço: "+endereco);
    }
    
    public abstract void atualizarDados(String novoEndereco, String novoTelefone);
    public abstract void validarCadastro();
}