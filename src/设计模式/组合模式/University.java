package 设计模式.组合模式;

import java.util.ArrayList;
import java.util.List;

// University就是Composite，可以管理College
public class University extends OrganizationComponent {

    //List中存放的是College
    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println("----------" + getName() + "----------");
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
    }
}
