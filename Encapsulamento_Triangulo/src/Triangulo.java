
public class Triangulo {
	/*- x : double
- y : double
- z : double
*/
	private double x;
	private double y;
	private double z;
	
	public String validaTriangulo() {
		if(this.x + this.y > this.z && this.x + this.z > this.y && this.z + this.y > this.x) {
			if(this.x == this.y && this.x == this.z)
				return "Equilátero";
			else if(this.x != this.y && this.x != this.z && this.y != this.z)
				return "Escaleno";
			else
				return "Isósceles";
		}
		else
			return "Não existe triangulo";
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	
	
	

}
