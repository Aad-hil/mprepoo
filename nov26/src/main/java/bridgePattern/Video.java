package bridgePattern;

public abstract class Video {
	
	protected VideoQualityProcessing quality;
	public Video(VideoQualityProcessing quality) {
		this.quality = quality;
	}
	public abstract void playVideo();
	

}
