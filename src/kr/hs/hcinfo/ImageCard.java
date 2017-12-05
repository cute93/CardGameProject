package kr.hs.hcinfo;

public class ImageCard extends ValuedCard {
	public static final String baseURL = "Resource\\img\\";
	private String imagePos;
	
	public ImageCard() {
		super();
		// TODO Auto-generated constructor stub
		imagePos = baseURL;
	}

	public ImageCard(int num, String shape, int v) {
		super(num, shape, v);
		// TODO Auto-generated constructor stub
		imagePos = baseURL;
	}

	public ImageCard(int num, String shape) {
		super(num, shape);
		// TODO Auto-generated constructor stub
		imagePos = baseURL;
	}

	public ImageCard(String shape, int num, int v) {
		super(shape, num, v);
		// TODO Auto-generated constructor stub
		imagePos = baseURL;
	}

	public ImageCard(String shape, int num) {
		super(shape, num);
		// TODO Auto-generated constructor stub
		imagePos = baseURL;
	}

	public ImageCard(String shape, int num, int v, String url) {
		super(shape, num, v);
		imagePos = baseURL+url;
		// TODO Auto-generated constructor stub
	}

	public String getImagePos() {
		return imagePos;
	}

	public void setImagePos(String imagePos) {
		this.imagePos = imagePos;
	}
	
	
}
