package braxxi.kursach.commons.entity;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ScriptEntity extends BaseEntity  {
    private List<PageEntity> pageList;
    private Map<Long, PageEntity> pageMap;
    private String name;
    private Long endPage;
    private String description;

    public ScriptEntity() {
    }

    public ScriptEntity(Long id) {
        this.setId(id);
    }


    public String getName() { return this.name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() { return this.description; }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<PageEntity> getPageList() { return this.pageList; }
    public void setPageList(List<PageEntity> pageList) {
        this.pageList = pageList;
        pageMap = pageList.stream().collect(Collectors.toMap(PageEntity::getId, Function.identity()));
    }

    public Map<Long, PageEntity> getPageMap() {
        return pageMap;
    }

    public Long getEndPage() {
        return endPage;
    }

    public void setEndPage(Long endPage) {
        this.endPage = endPage;
    }

    public PageEntity getPage(Long pageID) {
        return pageMap.get(pageID);
    }
}
