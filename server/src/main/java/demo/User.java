package demo;

/**
 * @Author: liushoulong
 * @Date: 2019/9/27 9:20
 */
public class User {

    private long id;
    private String tableName;
    private int page;
    private int size;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", tableName='" + tableName + '\'' +
                ", page=" + page +
                ", size=" + size +
                '}';
    }
}
