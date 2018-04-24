package braxxi.kursach.commons.entity;

import java.util.List;

public class PageEntity extends BaseEntity {
    private String title;
    private String text;
    private List <ActionEntity> actionList;

    public PageEntity() {
    }

    public PageEntity(Long id) {
        this.setId(id);
    }

    public String getTitle() { return this.title; }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() { return this.text; }
    public void setText(String text) {
        this.text = text;
    }

    public List getActionList() { return this.actionList; }
    public void setActionList(List actionList) { this.actionList = actionList; }
}
