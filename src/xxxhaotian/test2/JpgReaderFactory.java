package xxxhaotian.test2;

public class JpgReaderFactory extends ImageReaderFactory{

	@Override
	public ImageReader createReader() {
		// TODO Auto-generated method stub
		ImageReader ir = new JpgReader();
		return ir;
	}

}
