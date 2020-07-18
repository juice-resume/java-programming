package easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;

public class ExcelRaw {
    @ExcelProperty("ID")
    private String id;
    @ExcelProperty("名称")
    private String name;
    @ExcelProperty("描述")
    private String desc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
