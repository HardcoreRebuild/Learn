package MyAnnotation;

@TestObjectTable("tb_test_object")
public class TestObject {
    @TestObjectField(columnName = "id",type = "int",length = 10)
    private int id;
    @TestObjectField(columnName = "name",type = "String",length = 50)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
