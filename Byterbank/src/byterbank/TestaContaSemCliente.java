/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package byterbank;
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(6646,969060);
		System.out.println(contaDaMarcela.getSaldo());

		contaDaMarcela.setTitular(new Cliente());
		System.out.println(contaDaMarcela.getTitular());

		contaDaMarcela.getTitular().setNome("Marcela");
		System.out.println(contaDaMarcela.getTitular().getNome());

	}
}