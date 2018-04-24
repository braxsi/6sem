package braxxi.kursach.commons.entity;

public class ActionEntity extends BaseEntity {
    private int transit;
    private int bandage = 0;
    private int cartridges = 0;
    private int radiation = 0;
    private int gold = 0;

    public ActionEntity() {
    }

    public ActionEntity(Long id) {
        this.setId(id);
    }

    public int getTransit() {
        return this.transit;
    }
    public void setTransit(int transit) {
        this.transit = transit;
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

}
