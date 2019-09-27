package demo;

/**
 * @Author: liushoulong
 * @Date: 2019/9/27 11:52
 */
public class Params {

    private long rowKey;
    private String tableName;
    private int page;
    private int size;

    public long getRowKey() {
        return rowKey;
    }

    public void setRowKey(long rowKey) {
        this.rowKey = rowKey;
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
}
