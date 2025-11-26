package bridgePattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video HDvyoutube = new Youtube(new HDProcessing());
		Video v4kyoutube = new Youtube(new Speed4K());
		Video v8kyoutube = new Youtube(new Speed8K());
		
		HDvyoutube.playVideo();
		v4kyoutube.playVideo();
		v8kyoutube.playVideo();

		Video HDvprime = new Prime(new HDProcessing());
		Video v4kprime = new Prime(new Speed4K());
		Video v8kprime = new Prime(new Speed8K());
		
		v4kprime.playVideo();
		HDvprime.playVideo();
		v8kprime.playVideo();

	}

}
