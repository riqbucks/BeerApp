public class Beer {

    private int id;
    private String name;
    private String tagline;
    private String firstbrewed;
    private String description;
    private String imageUrl;

    public Beer(int id, String name, String tagline, String firstbrewed, String description, String imageUrl) {
        this.id = id;

        this.name = name;

        this.tagline = tagline;

        this.firstbrewed = firstbrewed;

        this.description = description;

        this.imageUrl = imageUrl;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;

    }

    public String getTagline() {
        return tagline;
    }

    public String getFirstbrewed() {
        return firstbrewed;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}

