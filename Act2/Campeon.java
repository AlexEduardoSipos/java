package model;

import java.util.List;

public class Champion {
    private int id;
    private String name;
    private String title;
    private List<String> tags;
    private String lore;

    public Champion(int id, String name, String title, List<String> tags, String lore) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.tags = tags;
        this.lore = lore;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getTitle() { return title; }
    public List<String> getTags() { return tags; }
    public String getLore() { return lore; }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Title: %s, Tags: %s", id, name, title, String.join(", ", tags));
    }
}
