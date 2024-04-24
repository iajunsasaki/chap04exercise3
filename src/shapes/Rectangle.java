package shapes;

/**
 * 四角形を表すクラス
 */
public class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
        System.out.println("四角形を描画します。幅： " + this.width + " 高さ：" + this.height);
	}

}
