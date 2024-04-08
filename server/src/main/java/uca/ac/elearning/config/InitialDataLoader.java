package uca.ac.elearning.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.bean.path.PathStatus;
import uca.ac.elearning.bean.users.Role;
import uca.ac.elearning.bean.users.User;
import uca.ac.elearning.dao.commonDao.DayDao;
import uca.ac.elearning.dao.pathDao.PathStatusDao;
import uca.ac.elearning.dao.users.UserDao;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitialDataLoader implements ApplicationRunner {

    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;
    private final DayDao dayDao;
    private final PathStatusDao pathStatusDao;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Check if admin user already exists
        if (userDao.findByEmail("admin@email.com").isEmpty()) {
            // Create and save the admin user
            var adminUser = User.builder()
                    .firstname("admin")
                    .lastname(null)
                    .email("admin@email.com")
                    .password(passwordEncoder.encode("adminpassword"))
                    .role(Role.ADMIN)
                    .build();
            userDao.save(adminUser);
        }
        if (dayDao.count() == 0) {
            // Create and save initial days
            List<String> initialDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
            initialDays.forEach(day -> {
                var dayEntity = Day.builder()
                                .label(day)
                        .code(day.toLowerCase()).build();
                dayDao.save(dayEntity);
            });
        }
        if (pathStatusDao.count() == 0) {
            // Create and save initial path status
            List<String> initialPathStatus = Arrays.asList("Beginner", "Intermediate", "Advanced");
            initialPathStatus.forEach(status -> {
                var pathEntity = PathStatus.builder()
                        .label(status)
                        .code(status.toLowerCase()).build();
                pathStatusDao.save(pathEntity);
            });
        }
    }
}
