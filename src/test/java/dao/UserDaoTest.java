//package dao;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.drill.model.po.User;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * Created by gygesM on 2016/11/28.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(value = "classpath:spring-context.xml")
//public class UserDaoTest {
//
//    @Resource
//     userDao;
//
//    @Test
//    public void getAllResult() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<User> userList = userDao.getAll();
////        List<User> filter = userList.stream().filter(user -> Optional.empty().equals(user)).collect(Collectors.toList());
////        filter.forEach(System.out::println);
//     String s = objectMapper.writeValueAsString(userList);
//       System.out.println(s);
//    }
//
//    @Test
//    public void getResult() throws JsonProcessingException {
//        int id = 1;
//        User user = userDao.getById(id);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String json = objectMapper.writeValueAsString(user);
//        System.out.println(json);
//    }
//
//    @Test
//    public void saveResult(){
//        User user = new User();
//        user.setId(2);
//        user.setLocked("0");
//        user.setSalt("66777");
//        user.setPassword("sdfsafadsfasdfasdf");
//        user.setUsercode("sdfaa");
//        user.setUsername("张三");
//        userDao.insertUser(user);
//    }
//
//    @Test
//    public void getPwd() throws JsonProcessingException {
//        User user = new User();
//        ObjectMapper objectMapper = new ObjectMapper();
//        user.setUsername("张三");
//        user = userDao.getPwdByUsername(user.getUsername());
//        String result = objectMapper.writeValueAsString(user);
//        System.out.println(result);
//    }
//
//}
