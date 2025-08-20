package tpEncapsulamiento;

public class Pedido {
	private int listaProducto;
	private Producto producto;
	
	Pedido(int listaProducto){
		this.listaProducto = listaProducto;
	}
	public int getProductos() {
		return listaProducto;
	}
	
	public void setProductos(int listaProducto) { 
		this.listaProducto = listaProducto;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
