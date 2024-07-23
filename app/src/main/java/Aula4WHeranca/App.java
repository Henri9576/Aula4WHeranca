package Aula4WHeranca;

public class App {

    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Henrique");
        v.setSalario(100.0f);
        //v.setCpf("1234567890");
        //v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salario do vendedor é: " + v.calcularSalario());
        
        Motorista m = new Motorista();
    }
}
