package braxxi.kursach.commons.model;

import braxxi.kursach.commons.entity.EstateEntity;

public class EstateRequest {

	private EstateEntity estate;

	public EstateRequest() {
	}

	public EstateRequest(EstateEntity estate) {
		this.estate = estate;
	}

	public EstateEntity getEstate() {
		return this.estate;
	}

	public void setEstate(EstateEntity estate) {
		this.estate = estate;
	}
}
