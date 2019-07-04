package lk.abms.sl.abms_site_manager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpCategory {
    @Id
    private String EmpCatId;
    private String name;
    private String createBy;

    public EmpCategory() {
    }

    public EmpCategory(String empCatId, String name, String createBy) {
        setEmpCatId(empCatId);
        this.setName(name);
        this.setCreateBy(createBy);
    }


    public String getEmpCatId() {
        return EmpCatId;
    }

    public void setEmpCatId(String empCatId) {
        EmpCatId = empCatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return "EmpCategory{" +
                "EmpCatId='" + EmpCatId + '\'' +
                ", name='" + name + '\'' +
                ", createBy='" + createBy + '\'' +
                '}';
    }
}
