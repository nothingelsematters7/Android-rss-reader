package by.bsu.fpmi;
import java.util.ArrayList;
import java.util.List;

/*
 * Stores an RSS feed
 */
public class Feed {

	final String title;
	final String link;
	final String description;
	final String language;
	final String copyright;
	final String pubDate;
	final List<FeedMessage> entries = new ArrayList<FeedMessage>();

	public Feed(String title, String link, String description, String language,
			String copyright, String pubDate) {
		this.title = title;
		this.link = link;
		this.description = description;
		this.language = language;
		this.copyright = copyright;
		this.pubDate = pubDate;
	}

	public List<FeedMessage> getMessages() {
		return entries;
	}

	public String getTitle() {
		return title;
	}

	public String getLink() {
		return link;
	}

	public String getDescription() {
		return description;
	}

	public String getLanguage() {
		return language;
	}

	public String getCopyright() {
		return copyright;
	}

	public String getPubDate() {
		return pubDate;
	}

	@Override
	public String toString() {
		StringBuilder allFeeds = new StringBuilder();
		for (FeedMessage message : entries) {
			allFeeds.append(message.toString() + "\n");
		}
		
		return allFeeds.toString();
	}

}