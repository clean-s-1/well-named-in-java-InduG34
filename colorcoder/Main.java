package colorcoder;

public class Main {
	
	public static void main(String[] args) {
		ColorPairImpl colorPairImpl = new ColorPairImpl();
		colorPairImpl.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		colorPairImpl.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		colorPairImpl.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		colorPairImpl.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
	}
}
