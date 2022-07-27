package Homework;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestUser {

    User firstUser = new User(18, "Yuriy", 80, true, "IT engineer");
    User secondUser = new User(16, "Andrew", 98, true, "Teacher");
    User thirdUser = new User(28, "John", 81, true, "Economist");
    User fourthUser = new User(14, "Sergey", 66, true, "IT engineer");
    User fifthUser = new User(18, "Lina", 54, false, "Driver");
    User sixthUser = new User(19, "Olena", 50, false, "IT engineer");
    User seventhUser = new User(31, "Julia", 61, false, "IT engineer");
    User eighthUser = new User(45, "Yuriy", 76, true, "IT engineer");
    User ninthUser = new User(18, "Yuriy", 83, true, "Teacher");
    User tenthUser = new User(17, "Alina", 55, false, "Economist");
    User eleventhUser = new User(18, "Olia", 41, false, "IT engineer");
    User twelfthUser = new User(18, "Nikita", 77, true, "Engineer");
    User thirteenthUser = new User(36, "Semen", 90, true, "Teacher");
    User fourteenthUser = new User(41, "Kolya", 106, true, "IT engineer");
    User fifteenthUser = new User(17, "Denys", 81, true, "IT engineer");

    List<User> userList = Arrays.asList(firstUser, secondUser, thirdUser, fourthUser, fifthUser,
            sixthUser, seventhUser, eighthUser, ninthUser, tenthUser, eleventhUser,
            twelfthUser, thirteenthUser, fourteenthUser, fifteenthUser);

    public List<User> getConditions(List<User> userList, UserCheck userCheck) {
        List<User> result = new ArrayList<>();
        for (User user : userList) {
            if (userCheck.checkConditions(user)) {
                result.add(user);
            }
        }
        return result;
    }

    @Test
    public void checkUsersBySex() {
        List<User> result;
        result = getConditions(userList, new UserCheck() {
            @Override
            public boolean checkConditions(User user) {
                return !user.sex;
            }
        });

        for (User user : result) {
            Assert.assertEquals(user.sex, false);
        }
    }

    @Test
    public void checkWeightLessThan70() {
        List<User> result;
        result = getConditions(userList, new UserCheck() {
            @Override
            public boolean checkConditions(User user) {
                return user.weight < 70;
            }
        });

        for (User user : result) {
            Assert.assertTrue(user.weight < 70);
        }
    }

    @Test
    public void checkUsersByName() {
        List<User> result;
        result = getConditions(userList, new UserCheck() {
            @Override
            public boolean checkConditions(User user) {
                return user.name.equals("Yuriy");
            }
        });

        for (User user : result) {
            Assert.assertEquals(user.name, "Yuriy");
        }
    }

    @Test
    public void checkUsersWithAgeMoreThan18() {
        List<User> result;
        result = getConditions(userList, new UserCheck() {
            @Override
            public boolean checkConditions(User user) {
                return user.age >= 18;
            }
        });

        for (User user : result) {
            Assert.assertTrue(user.age >= 18);
        }
    }

    @Test
    public void checkUsersBySpecialityAndName() {
        List<User> result;
        result = getConditions(userList, new UserCheck() {
            @Override
            public boolean checkConditions(User user) {
                return user.speciality.equals("IT engineer")
                        && user.name.equals("Yuriy");
            }
        });

        for (User user : result) {
            Assert.assertTrue(user.speciality.equals("IT engineer") && user.name.equals("Yuriy"));
        }
    }

    @Test
    public void checkUsersBySpeciality() {
        List<User> result;
        result = getConditions(userList, new UserCheck() {
            @Override
            public boolean checkConditions(User user) {
                return user.speciality.equals("IT engineer");
            }
        });

        for (User user : result) {
            Assert.assertEquals(user.speciality, "IT engineer");
        }
    }

    @Test
    public void checkUsersBySpecialities() {
        List<User> result;
        result = getConditions(userList, new UserCheck() {
            @Override
            public boolean checkConditions(User user) {
                return user.speciality.equals("Economist")
                        || user.speciality.equals("Driver");
            }
        });

        for (User user : result) {
            Assert.assertTrue(user.speciality.equals("Economist") || user.speciality.equals("Driver"));
        }
    }

    @Test
    public void checkUsersByAgeOrWeight() {
        List<User> result;
        result = getConditions(userList, new UserCheck() {
            @Override
            public boolean checkConditions(User user) {
                return user.age == 18
                        || user.weight == 81;
            }
        });

        for (User user : result) {
            Assert.assertTrue(user.age == 18 || user.weight == 81);
        }
    }

    @Test
    public void checkUsersByNameOrAgeAndSex() {
        List<User> result;
        result = getConditions(userList, new UserCheck() {
            @Override
            public boolean checkConditions(User user) {
                return (user.age == 18 && !user.sex)
                        || user.name.equals("Julia");
            }
        });

        for (User user : result) {
            Assert.assertTrue((user.age == 18 && !user.sex)
                    || user.name.equals("Julia"));
        }
    }

    @Test
    public void checkUsersBySpecialityOrName() {
        List<User> result;
        result = getConditions(userList, new UserCheck() {
            @Override
            public boolean checkConditions(User user) {
                return user.speciality.equals("IT engineer")
                        || user.name.equals("Oleg");
            }
        });

        for (User user : result) {
            Assert.assertTrue(user.speciality.equals("IT engineer") || user.name.equals("Oleg"));
        }
    }
}
