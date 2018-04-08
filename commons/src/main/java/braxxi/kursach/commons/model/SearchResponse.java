package braxxi.kursach.commons.model;

import braxxi.kursach.commons.entity.EstateEntity;

import java.util.List;

public class SearchResponse {

	private List<EstateEntity> estates;

	public SearchResponse() {
	}

	public SearchResponse(List<EstateEntity> estates) {
		this.estates = estates;
	}

	public List<EstateEntity> getEstates() {
		return this.estates;
	}
}
