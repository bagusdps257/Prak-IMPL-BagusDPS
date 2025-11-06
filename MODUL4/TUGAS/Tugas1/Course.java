public class Course { 
    private String CourseName; 
    private String CourseId; 
    private String CourseCategory; 

    public String getId() { 
        return CourseId; 
    } 

    public void setId(String id) { 
        CourseId = id; 
    } 

    public String getName() { 
        return CourseName; 
    } 

    public void setName(String name) { 
        CourseName = name; 
    } 

    public String getCategory() { 
        return CourseCategory; 
    } 

    public void setCategory(String category) { 
        CourseCategory = category; 
    } 
}
