package shapes;

/**
 * 円を表すクラス
 */
public class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
        System.out.println("円を描画します。半径： " + radius);
    }
}
