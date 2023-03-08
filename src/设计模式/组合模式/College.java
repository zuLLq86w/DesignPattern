package 设计模式.组合模式;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    //List中存放的是Department
    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // 将来实际业务中，College的add和University中add不一定相同
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
