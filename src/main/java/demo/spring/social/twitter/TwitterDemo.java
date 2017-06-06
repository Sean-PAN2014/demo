package demo.spring.social.twitter;

import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

// http://www.baeldung.com/spring_social_twitter_setup
public class TwitterDemo {
	private static final String consumerKey = "aWb8m15Uu9c8DTzm0DiCcDYXS";
	private static final String consumerSecret = "YgWQgB8iusplAytmEuXVDdZ1rIxGCmRZXlCTq0nit0go3njWMo";
	private static final String accessToken = "871934346285940736-GGovpoe8bt1kWL2FfcUncU5bK91Goe9";
	private static final String accessTokenSecret = "GeemnqAxPI8JjDm6tXkfXmBmqMp022YrD4ukTgaLE2azl";

	public static void main(String[] args) {
		// 
		Twitter twitter = new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
//		System.out.println(twitter.searchOperations().search("haha", 1).getTweets());
		System.out.println(twitter.timelineOperations().updateStatus(message()));
	}

	private static String message() {
		StringBuilder sb = new StringBuilder();
		sb.append("指標発表結果。13:30 [AUD] 豪準備銀行（中央銀行）、政策金利発表(前回結果:1.50％ 予想:1.50％ 結果:1.50％)").append(System.lineSeparator());
		// http://min-fx.jp/market/indicators/
		// http://bit.ly/c3xlcP
		sb.append("http://bit.ly/c3xlcP  #fx #kawase");
		return sb.toString();
	}

}
