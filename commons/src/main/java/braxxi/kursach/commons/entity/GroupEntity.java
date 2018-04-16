package braxxi.kursach.commons.entity;

import java.security.acl.Group;

public class GroupEntity extends BaseEntity {
    private String name;

    public GroupEntity() {
    }

    public GroupEntity(Long id) {
        this.setId(id);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}