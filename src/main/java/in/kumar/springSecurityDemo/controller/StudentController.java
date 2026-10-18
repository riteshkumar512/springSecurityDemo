package in.kumar.springSecurityDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @GetMapping
    public ResponseEntity<String> getStudent(){
        return ResponseEntity.ok("Student retrived Successful");
    }
    @PostMapping
    public ResponseEntity<String> createStudent(){
        return ResponseEntity.ok("Student Created Successfully");
    }
    @PutMapping
    public ResponseEntity<String> updateStudent(){
        return ResponseEntity.ok("Student update Successfully");
    }
    @DeleteMapping
    public ResponseEntity<String> deleteStudent(){
        return ResponseEntity.ok("Student deleted Successfully");
    }

    @GetMapping("/csrf")
    public CsrfToken getToken(CsrfToken csrfToken){
        return csrfToken;
    }
}
