package demo.spring.social.twitter;

import java.util.List;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

// http://www.baeldung.com/spring_social_twitter_setup
public class TwitterDemoApplication {
	private static final String consumerKey = "aWb8m15Uu9c8DTzm0DiCcDYXS";
	private static final String consumerSecret = "YgWQgB8iusplAytmEuXVDdZ1rIxGCmRZXlCTq0nit0go3njWMo";
	private static final String accessToken = "871934346285940736-GGovpoe8bt1kWL2FfcUncU5bK91Goe9";
	private static final String accessTokenSecret = "GeemnqAxPI8JjDm6tXkfXmBmqMp022YrD4ukTgaLE2azl";

	public static void main(String[] args) {
		// 
		Twitter twitter = new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
		List<Tweet> userTimeline = twitter.searchOperations().search("haha", 1).getTweets();
		System.out.println(userTimeline);
		System.out.println(userTimeline.get(0).getText());
		System.out.println(twitter.timelineOperations().updateStatus("Hello World1!"));
	}

}
