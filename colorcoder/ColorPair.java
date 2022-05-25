package colorcoder;

public class ColorPair {

	private MajorColor majorColor;
	private MinorColor minorColor;
	
	public ColorPair(MajorColor major, MinorColor minor) {
		this.majorColor = major;
		this.minorColor = minor;
	}

	public MajorColor getMajor() {
		return this.majorColor;
	}
	
	public MinorColor getMinor() {
		return this.minorColor;
	}

	public int getMajorColorLength() {
		return MajorColor.values().length;
	}
	
	public int getMinorColorLength() {
		return MinorColor.values().length;
	} 
	
	public MajorColor[] getMajorColorNames() {
		return MajorColor.values();
	}
	
	public MinorColor[] getMinorColorNames() {
		return MinorColor.values();
	}
	
	public String toString() {
		return  getMajorColorNames()[majorColor.getIndex()]+ " " + getMinorColorNames()[minorColor.getIndex()];
		
	}
}
