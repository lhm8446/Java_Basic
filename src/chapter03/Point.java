package chapter03;

public class Point {
	private int x;
	private int y;
	private String color;
	
	public Point(){
		
	}
	public Point (int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

	public boolean equals2(Object obj) {
		if(this == obj){				// this =
			return true;
		}
		if(this.getClass() != obj.getClass()){   
			return false;
		}
		
		Point other = (Point)obj;        // Object로 받은 매개변수 obj를 Point로 다운캐스팅
		
		if(this.x !=other.getX()){		 
			return false;
		}
		if(this.y !=other.getY()){
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", color=" + color + "]";
	}   // toString 오버라이딩 후  source > Generate toString()
	
	
	@Override
	public int hashCode() {   
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	} // equals 오버라이드 시 해쉬코드도 같이 오버라이드, 내용기반으로 같은 값이 안들어가도록 설정
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
