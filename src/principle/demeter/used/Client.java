package principle.demeter.used;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用迪米特法则
 *
 * @author: clarity
 * @date: 2022年11月30日 11:47
 */
public class Client {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        CollegeManager collegeManager = new CollegeManager();
        schoolManager.printAllStaff(collegeManager);
    }
}

/**
 * 学校总部员工
 */
class HeadquarterStaff {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 学校学院员工
 */
class CollegeStaff {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 管理学院员工的管理类
 */
class CollegeManager {

    /**
     * 获取学院所有员工
     * @return 学院所有员工列表
     */
    public List<CollegeStaff> getAllCollegeStaff() {
        List<CollegeStaff> collegeStaffList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            CollegeStaff collegeStaff = new CollegeStaff();
            collegeStaff.setId("学院员工 id：" + i);
            collegeStaffList.add(collegeStaff);
        }
        return collegeStaffList;
    }

    /**
     * 打印学院所有员工
     */
    public void printCollegeAllStaff() {
        System.out.println("---------------------学院员工---------------------");
        List<CollegeStaff> collegeStaffList = getAllCollegeStaff();
        collegeStaffList.stream().map(CollegeStaff::getId).forEach(System.out::println);
    }
}

/**
 * 管理学校员工的管理类
 */
class SchoolManager {

    /**
     * 获取学校总部所有员工
     * @return 学校总部所有员工列表
     */
    public List<HeadquarterStaff> getHeadquarterStaff() {
        List<HeadquarterStaff> headquarterStaffList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            HeadquarterStaff headquarterStaff = new HeadquarterStaff();
            headquarterStaff.setId("学校总部员工 id：" + i);
            headquarterStaffList.add(headquarterStaff);
        }
        return headquarterStaffList;
    }

    /**
     * 打印所有员工
     * @param collegeManager 管理学院员工的管理类对象
     */
    public void printAllStaff(CollegeManager collegeManager) {
        System.out.println("---------------------使用迪米特法则---------------------");
        System.out.println("---------------------学校总部员工---------------------");
        List<HeadquarterStaff> headquarterStaff = getHeadquarterStaff();
        headquarterStaff.stream().map(HeadquarterStaff::getId).forEach(System.out::println);
        // 我们可以将他是实现在 CollegeManager 的内部
        // 也就证明了“对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部“
/*        System.out.println("---------------------学院员工---------------------");
        List<CollegeStaff> collegeStaffList = collegeManager.getAllCollegeStaff();
        collegeStaffList.stream().map(CollegeStaff::getId).forEach(System.out::println);*/
        collegeManager.printCollegeAllStaff();
    }

}