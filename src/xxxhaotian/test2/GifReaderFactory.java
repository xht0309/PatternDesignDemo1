package xxxhaotian.test2;

public class GifReaderFactory extends ImageReaderFactory{

	@Override
	public ImageReader createReader() {
		// TODO Auto-generated method stub
		ImageReader ir = new GifReader();
		return ir;
	}

}
