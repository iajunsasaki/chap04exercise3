package shapes;

/**
 * 三角形を表すクラス
 */
public class Triangle extends Shape {
	private int side1;
	private int side2;
	private int side3;
	
	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public void draw() {
        System.out.println("三角形を描画します。辺１： " + this.side1 + " 辺２：" + this.side2 + " 辺３：" + this.side3);
	}

}
