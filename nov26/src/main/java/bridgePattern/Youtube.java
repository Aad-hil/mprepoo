package bridgePattern;

public class Youtube extends Video {

	public Youtube(VideoQualityProcessing quality) {
		super(quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.print("Youtbe is now ");
		quality.processingSpeed();
	}

}
