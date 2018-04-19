package braxxi.kursach.commons.entity;

public class UserEntity extends BaseEntity {
	private String login;
	private String password;
	private String email;
	private int group_id;
	private int bandage;
	private int cartridges;
	private int radiation;
	private int gold;
	private Long map;


	public UserEntity() {
	}

	public UserEntity(Long id) {
		this.setId(id);
	}

	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getGroup_id() {
		return this.group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public int getBandage() {
		return this.bandage;
	}
	public void setBandage(int bandage) {
		this.bandage = bandage;
	}

	public int getCartridges() {
		return this.cartridges;
	}
	public void setCartridges(int cartridges) {
		this.cartridges = cartridges;
	}

	public int getRadiation() {
		return this.radiation;
	}
	public void setRadiation(int radiation) {
		this.radiation = radiation;
	}

	public int getGold() {
		return this.gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}

    public Long getMap() {
        return this.map;
    }
    public void setMap(Long map) {
        this.map = map;
    }
}
