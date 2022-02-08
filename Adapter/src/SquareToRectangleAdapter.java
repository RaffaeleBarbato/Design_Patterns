class Square {
	public int side;

	public Square(int side) {
		this.side = side;
	}
}

interface Rectangle {
	int getWidth();

	int getHeight();

	default int getArea() {
		return getWidth() * getHeight();
	}
}

class SquareToRectangleAdapter implements Rectangle {
	
	private Square square; //ADAPTER OBJECT

	public SquareToRectangleAdapter(Square square) {
		this.square = square;
	}

	@Override
	public int getWidth() {
		return square.side;
	}

	@Override
	public int getHeight() {
		return square.side;
	}

	class Demo {
		public static void main(String[] args) {
			int h, w;
			Square sq = new Square(4);
			SquareToRectangleAdapter ad = new SquareToRectangleAdapter(sq);
			h = ad.getHeight();
			w = ad.getWidth();
			int area = ad.getArea();
			System.out.println("height: " + h);
			System.out.println("width: " + w);
			System.out.println("L'area calcolata sull'oggetto adapater �: " + area);

		}
	}
}