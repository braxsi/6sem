package braxxi.kursach.commons.model;

import braxxi.kursach.commons.entity.EstateEntity;

public class EstateResponse {

	private EstateEntity estate;

	public EstateResponse() {
	}

	public EstateResponse(EstateEntity estate) {
		this.estate = estate;
	}

	public EstateEntity getEstate() {
		return this.estate;
	}
}
