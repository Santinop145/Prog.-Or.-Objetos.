package tpEncapsulamiento;

public class Cliente {
	private String nombre;
	private int listaCuentas;
	private CuentaBancaria cuenta;
	public Cliente(String nombre, int listaCuentas) {
		this.nombre = nombre;
		this.listaCuentas = listaCuentas;
	}
	
	public String getNombre() {
		return this.nombre;
		
	}
	
	public int getListaCuentas() {
		return this.listaCuentas;
	}
	
	public CuentaBancaria getCuenta() {
		return this.cuenta;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setListaCuentas(int listaCuentas) {
		this.listaCuentas = listaCuentas;
	}
	
	public void setBancaria(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
}

class CuentaBancaria {
	private String numeroCuenta;
	private int saldo;
	
	public CuentaBancaria(String numeroCuenta, int saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	
	public String getCuenta() {
		return this.numeroCuenta;
		
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	
	public void setCuenta(String numeroCuenta) {
		if (!numeroCuenta.isEmpty()) {
			this.numeroCuenta = numeroCuenta;
		}
		
	}
	
	public void setSaldo(int saldo) {
		if (saldo < 0) {
			System.out.println("El saldo no puede ser negativo.");
		}
		else {
			this.saldo = saldo;	
		}
	}
	
	public boolean depositar(int monto) {
        if (monto > 0) {
            this.saldo += monto;
            return true;
        } 
        else {
            System.out.println("El monto a depositar debe ser positivo.");
            return false;
        }
    }
	
	public boolean retirar(int monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser positivo.");
            return false;
        }
        if (monto <= this.saldo) {
            this.saldo -= monto;
            return true;
        } else {
            System.out.println("Saldo insuficiente. El saldo actual es: $" + this.saldo);
            return false;
        }
    }
}