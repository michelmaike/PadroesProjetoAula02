public class Diretor implements Fornecedor, Departamento, Autenticavel {
    @Override
    public void fazerPedido(){
        System.out.println("Diretor: Pedido autorizado");
    }
    
    @Override
    public void criarDepartamento(){
        System.out.println("Diretor criou um departamento");
    }
    
    @Override
    public void cadastrarFuncionarios() {
        System.out.println("O diretor cadastrou um novo funcionario");
    }
    
    @Override
    public void login(){
        System.out.println("Diretor logado");
    }
}