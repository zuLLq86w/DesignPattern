package 设计模式.组合模式;

public class Client {
    public static void main(String[] args) {
        // 从大到小创建对象
        OrganizationComponent university = new University("史莱克学校", "怪物学院");

        // 学院
        OrganizationComponent college1 = new College("计算机学院", "计算机学院描述");
        OrganizationComponent college2 = new College("语言学院", "语言学院描述");

        // 创建专业
        college1.add(new Department("Python", "Python描述"));
        college1.add(new Department("Java", "Java描述"));
        college1.add(new Department("C#", "C#描述"));

        college2.add(new Department("汉语", "汉语描述"));
        college2.add(new Department("英语", "英语描述"));

        university.add(college1);
        university.add(college2);

        university.print();
    }
}
