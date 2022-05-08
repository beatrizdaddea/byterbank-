
package byterbank;

public class TesteFuncionario {
    public static void main(String[] args){
        Funcionario Nico = new Funcionario();
        Nico.setCpf("377747553-06");
        Nico.setNome("Nico Santos");
        Nico.setSalario(2600.00);
        
        // teste de bonificação
         Funcionario f2 = new Funcionario();
         f2.setSalario(3000.00);
         System.out.println(f2.getTipo());
         System.out.println(f2.getBonificacao());
         
         Funcionario f3 = new Funcionario();
         f3.setSalario(5000.00);
         f3.setTipo(1);
         System.out.println(f3.getTipo());
         System.out.println(f3.getBonificacao());
         
         Funcionario f4 = new Funcionario();
         f4.setSalario(10000.00);
         f4.setTipo(2);
         System.out.println(f4.getTipo());
         System.out.println(f4.getBonificacao());
    }
}
