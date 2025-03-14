public class Gerente implements Fornecedor, Departamento, Autenticavel {
    @Override
    public void fazerPedido() {
        System.out.println("Gerente fez um pedido");
    }
    
    @Override
    public void criarDepartamento() {
        System.out.println("Gerente criou novo setor");
    }
    
    @Override
    public void cadastrarFuncionarios() {
        System.out.println("Gerente contratou uma equipe");
    }
    
    @Override
    public void login() {
        System.out.println("Gerente entrou");
    }
}