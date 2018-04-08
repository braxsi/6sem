package braxxi.kursach.commons.model;

import java.util.Collection;
import java.util.Map;

public class SystemDictionary {
    private String name;
    private Map<Integer, DictionaryItem> itemMap;

    public SystemDictionary() {
    }

    public SystemDictionary(String name, Map<Integer, DictionaryItem> itemMap) {
        this.name = name;
        this.itemMap = itemMap;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, DictionaryItem> getItemMap() {
        return itemMap;
    }

    public Collection<DictionaryItem> getItems() {
        return itemMap.values();
    }

    public DictionaryItem findById(Integer districtId) {
        return itemMap.get(districtId);
    }
}
