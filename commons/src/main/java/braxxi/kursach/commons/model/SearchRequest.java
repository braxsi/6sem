package braxxi.kursach.commons.model;

public class SearchRequest {

	private SearchEstate searchEstate;

	public SearchRequest() {
	}

	public SearchRequest(SearchEstate searchEstate) {
		this.searchEstate = searchEstate;
	}

	public SearchEstate getSearchEstate() {
		return this.searchEstate;
	}
}
