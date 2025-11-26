package bridgePattern;

public class Prime extends Video {

	public Prime(VideoQualityProcessing quality) {
		super(quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.print("Prime is now playing in ");
		quality.processingSpeed();
		
	}

}
