//---------> CuentaAhorro

class CuentaAhorro extends CuentaCorriete{
	
	//ATRIBUTOS
	private int limretiros;
	private double saldomin;
	
	//METODOS
	CuentaAhorro(){
		super();
		limretiros = 0;
		saldomin = 0;
	}
	
	CuentaAhorro(String nombre, 
				String banco, 
				String nocuenta,
				String clabe,
				double saldo,
				double saldomin,
				int limretiros){
		super(nombre,banco,nocuenta,clabe,saldo);
		setSaldoMinimo(saldomin);
		setLimiteRetiros(limretiros);
	}
	
	//METODOS SET
	public void setSaldoMinimo(double saldomin){
		this.saldomin = saldomin;
	}
	
	public void setLimiteRetiros(int limretiros){
		this.limretiros = limretiros;
	}

	//METODOS GET
	public double getSaldoMinimo(){
		return saldomin;
	}
	
	public int getLimiteRetiros(){
		return limretiros;
	}
	
	@Override
	public String toString(){
		String cadena;
		cadena = super.toString() + 
		"Saldo Minimo en la cuenta: " + Double.toString(saldomin) + "\n" +
		"Limite maximo de retiros por mes: " + Integer.toString(limretiros) + "\n";
		return cadena;
		
	}
}//FIN CLASE CuentaAhorro
