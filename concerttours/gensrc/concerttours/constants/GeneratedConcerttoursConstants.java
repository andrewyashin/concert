/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 31, 2018 4:12:58 PM                     ---
 * ----------------------------------------------------------------
 */
package concerttours.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedConcerttoursConstants
{
	public static final String EXTENSIONNAME = "concerttours";
	public static class TC
	{
		public static final String BAND = "Band".intern();
		public static final String CONCERT = "Concert".intern();
		public static final String CONCERTTYPE = "ConcertType".intern();
		public static final String MUSICTYPE = "MusicType".intern();
	}
	public static class Attributes
	{
		public static class MusicType
		{
			public static final String BANDS = "bands".intern();
		}
		public static class Product
		{
			public static final String BAND = "band".intern();
			public static final String HASHTAG = "hashTag".intern();
		}
	}
	public static class Enumerations
	{
		public static class ConcertType
		{
			public static final String OPENAIR = "openair".intern();
			public static final String INDOOR = "indoor".intern();
		}
		public static class MusicType
		{
			public static final String ROCK = "rock".intern();
			public static final String POP = "pop".intern();
		}
	}
	public static class Relations
	{
		public static final String BAND2MUSICTYPE = "Band2MusicType".intern();
		public static final String PRODUCT2ROCKBAND = "Product2RockBand".intern();
	}
	
	protected GeneratedConcerttoursConstants()
	{
		// private constructor
	}
	
	
}
