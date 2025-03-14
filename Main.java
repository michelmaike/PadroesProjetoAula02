public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("michel", 22, "Rua da Alvorada", "999999999", "michel@gmail.com");
        
        cliente.login();
        cliente.mostrarDadosBasicos();
        cliente.mostrarContato();
        cliente.validarCadastro();
        cliente.atualizarDados("Rua Eucalipto", "8888888888");

        Engenheiro engen = new Engenheiro();
        engen.fazerPedido();

        Diretor diret = new Diretor();
        diret.login();
        diret.criarDepartamento();
        diret.fazerPedido();

        Gerente geren = new Gerente();
        geren.login();
        geren.cadastrarFuncionarios();
    }
}