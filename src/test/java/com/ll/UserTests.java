//package com.ll;
//
//import com.ll.admin.dao.LoginRepository;
//import com.ll.admin.dao.UserRepository;
//import com.ll.admin.domain.Login;
//import com.ll.admin.domain.User;
//import com.ll.admin.mapper.UserMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//import java.util.Map;
//
//@SpringBootTest
//class UserTests {
//
//    @Test
//    void contextLoads() {
//        System.out.println("ok!");
//    }
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    void loginAndUsers() {
//        List<Map<String,Object>> allUser = userMapper.findAllUser();
//        allUser.forEach( System.out::println );
//    }
//
//    @Test
//    void getUser() {
//        Map<String, Object> user = userMapper.getUser("9C1E37A2366E3441B1947F6364541212");
//        System.out.println(user);
//    }
//
//    @Autowired
//    private LoginRepository loginRepository;
//    @Test
//    void getUserByUsername() {
//        Login chenyb = loginRepository.findByUsername( "chenyb" );
//        System.out.println(chenyb);
//    }
//
//    @Test
//    void userEtity() {
//        User user = new User();
//        user.setPhone( "18645636597" );
////        user.setIdentity( "19898989898" );
//        System.out.println(user.getPhone());
////        System.out.println(user.getIdentity());
//
////        Login login = new Login();
////        login.setUsername( "chenyb" );
//    }
//}
