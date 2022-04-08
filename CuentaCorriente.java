//---------> CuentaCorriente

class CuentaCorriete{
	//ATRIBUTOS
	private String nombre,banco,nocuenta,clabe;
	private double saldo;
	
	//METODOS
	CuentaCorriete(){
		nombre = banco = nocuenta = clabe = "";
		saldo = 0;
	}
	
	CuentaCorriete(String nombre, 
					String banco, 
					String nocuenta,
					String clabe,
					double saldo){
		setNombre(nombre);
		setBanco(banco);
		setNoCuenta(nocuenta);
		setClabe(clabe);
		setSaldo(saldo);
	}
	
	//METODOS SET
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setBanco(String banco){
		this.banco = banco;
	}
	
	public void setNoCuenta(String nocuenta){
		this.nocuenta = nocuenta;
	}
	
	public void setClabe(String clabe){
		this.clabe = clabe;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	//METODOS GET
	public String getNombre(){
		return nombre;
	}
	
	public String getBanco(){
		return banco;
	}
	
	public String getNoCuenta(){
		return nocuenta;
	}
	
	public String getClabe(){
		return clabe;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	@Override
	public String toString(){
		String cadena;
		cadena = "Banco: " + banco + "\n" +
		"Titutlar de la cuenta: " + nombre + "\n" +
		"Numero de cuenta: " + nocuenta + "\n" +
		"CLABE: " + clabe + "\n" +
		"Saldo: " + Double.toString(saldo) + "\n";
		return cadena;
	}
}//FIN CLASE CuentaCorriente
