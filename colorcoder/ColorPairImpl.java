package colorcoder;

public class ColorPairImpl {

	public ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;// 3
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / MajorColor.values().length);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % MinorColor.values().length);
		return new ColorPair(majorColor, minorColor);
	}

	public int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * MinorColor.values().length + minor.getIndex() + 1;
	}

	public void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = new ColorPair(expectedMajor,expectedMinor);
		colorPair= getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.toString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	public void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}
}
