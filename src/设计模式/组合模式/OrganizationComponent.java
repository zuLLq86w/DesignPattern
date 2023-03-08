package 设计模式.组合模式;

public abstract class OrganizationComponent {
    private String name; // 名字
    private String des; // 说明

    protected void add(OrganizationComponent organizationComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    };

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des){
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


    // print方法，抽象的，所有子类都必须实现
    protected abstract void print();
}
