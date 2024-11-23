//package kalra.himanshu.demo;
//
//import lombok.RequiredArgsConstructor;
//
//import java.util.Set;
//import java.util.concurrent.Delayed;
//
//public class Teacher {
//
//    Long id;
//
//    String name;
//
//    String subject;
//
//    @OneToMany() //
//            @JoinColumn()
//    Set<Student> students;
//
//
//
//
//    API: id => Delete
//
//    DELETE: "/noun/{id}"
//
//
//    @RestController
//
//    @DeleteRequest("/noun/{id}")
//    void delete(@PathVariable("id") String id) {
//
//    }
//
//
//    @RequiredArgsConstructor
//    EmployeeController{
//
////        @Autow
//        final EmployeeService employeeService;
//
//    }
//
//
//    Controller ->
//
//    Injecting Service
//
//    @Service
//    Service ->
//
//
//    DAO
//}
