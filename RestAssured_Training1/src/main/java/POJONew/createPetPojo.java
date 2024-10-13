package POJONew;

import java.util.ArrayList;

public class createPetPojo {
	private int id;
	private CategoryPetstore category;
    private String name;
    private ArrayList<String> photoUrls;
    private ArrayList<tagsPetstore> tags;
    private String status;


public createPetPojo() {}

public createPetPojo(int id, CategoryPetstore category, String name, ArrayList<String> photoUrls,
		ArrayList<tagsPetstore> tags, String status) {
	super();
	this.id = id;
	this.category = category;
	this.name = name;
	this.photoUrls = photoUrls;
	this.tags = tags;
	this.status = status;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public CategoryPetstore getCategory() {
	return category;
}

public void setCategory(CategoryPetstore category) {
	this.category = category;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public ArrayList<String> getPhotoUrls() {
	return photoUrls;
}

public void setPhotoUrls(ArrayList<String> photoUrls) {
	this.photoUrls = photoUrls;
}

public ArrayList<tagsPetstore> getTags() {
	return tags;
}

public void setTags(ArrayList<tagsPetstore> tags) {
	this.tags = tags;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

}
