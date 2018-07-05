package by.epam.jb25.Lesson09;

public class Newspaper extends Magazine {
	private String isNews;

	public Newspaper(String _EditionTitle, int _Published, int _Price,
			String _PublishingRegion, String _Specialization,
			String _AgeCategoty, String _isPeriodical,
			String _isNews) {
		super(_EditionTitle, _Published, _Price, _PublishingRegion,
				_Specialization, _AgeCategoty, _isPeriodical);
		this.isNews = _isNews;
	}
	
	public String getisNews(){
		return isNews;
	}

	@Override
	public String toString() {
		return "Newspaper [iisNews=" + isNews
				+ "]";
	}
}
