//---------> Main

import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		CuentaCorriete cc;
		CuentaAhorro ca;
		String nombre, banco, nocuenta, clabe;
		double saldo,saldomin;
		int limretiros;
		
		System.out.println("Cuentas bancarias");
		System.out.println("Ingresa los datos de la Cuenta Corriente");
		System.out.print("Dame el nombre del banco: ");
		banco = sc1.nextLine();
		System.out.print("Dame el nombre del titular: ");
		nombre = sc1.nextLine();
		System.out.print("Dame el numero de cuenta: ");
		nocuenta = sc1.nextLine();
		System.out.print("Dame la cuenta CLABE: ");
		clabe = sc1.nextLine();
		System.out.print("Dame el saldo de la cuenta: ");
		saldo = sc2.nextDouble();
		
		cc = new CuentaCorriete(nombre,banco,nocuenta,clabe,saldo);
		
		System.out.println("\nIngresa los datos de la Cuenta de Ahorro");
		System.out.print("Dame el nombre del banco: ");
		banco = sc1.nextLine();
		System.out.print("Dame el nombre del titular: ");
		nombre = sc1.nextLine();
		System.out.print("Dame el numero de cuenta: ");
		nocuenta = sc1.nextLine();
		System.out.print("Dame la cuenta CLABE: ");
		clabe = sc1.nextLine();
		System.out.print("Dame el saldo de la cuenta: ");
		saldo = sc2.nextDouble();
		System.out.print("Dame el saldo minimo diario: ");
		saldomin = sc2.nextDouble();
		System.out.print("Dame el numero maximo de retiros por mes: ");
		limretiros = sc2.nextInt();
		
		ca = new CuentaAhorro(nombre,banco,nocuenta,clabe,saldo,saldomin,limretiros);
		
		System.out.println("\n\nDatos correspondientes a las cuentas creadas");
		System.out.println("Cuenta Corriente\n" + cc.toString());
		System.out.println("Cuenta de ahorro\n" + ca.toString());
	}//FIN METODO Main
}//FIN Main
