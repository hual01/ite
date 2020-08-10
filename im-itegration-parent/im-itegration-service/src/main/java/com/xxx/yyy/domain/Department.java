package com.xxx.yyy.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer deptId;
    private String deptName;
    private Integer parentId;

    private String depPath;
    private Boolean enabled;
    private Boolean isParent;
    
    private List<Department> children = new ArrayList<>();
    private Integer result;
    
    public Department() {
    }

    public Department(String name) {

        this.deptName = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(deptName, that.deptName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(deptName);
    }


    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public List<Department> getChildren() {
        return children;
    }

    public void setChildren(List<Department> children) {
        this.children = children;
    }

    public Integer getId() {
        return deptId;
    }

    public void setId(Integer id) {
        this.deptId = id;
    }

    public String getName() {
        return deptName;
    }

    public void setName(String name) {
        this.deptName = name == null ? null : name.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getDepPath() {
        return depPath;
    }

    public void setDepPath(String depPath) {
        this.depPath = depPath;
    }

    public Boolean getParent() {
        return isParent;
    }

    public void setParent(Boolean parent) {
        isParent = parent;
    }
}