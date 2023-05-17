package automarket.controller;

import automarket.model.User;
import automarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usersDetails")
public class UserController {

@Autowired
    private UserService service;

@PostMapping("/saveUsers")
    public ResponseEntity<String> saveUsers(@RequestBody User user){
    Integer id = service.saveUser(user);
    return new ResponseEntity<String>("User with '"+ id +"' has been saved", HttpStatus.OK);
}

@GetMapping("/userList")
public ResponseEntity<List<User>> getAllUserDetails(){
    List<User> list = service.getAllUsers();
    return new ResponseEntity<List<User>>(list,HttpStatus.OK);
}

@GetMapping("/getUserById/{userID}")
public ResponseEntity<User> getUserById(@PathVariable("userID") Integer userID){
    User usr = service.getUserById(userID);
    return new ResponseEntity<User>(usr, HttpStatus.OK);
}

@PutMapping("/updateStudent/{userID}")
public ResponseEntity<String> updateStudent(@PathVariable("userID") Integer userID, @RequestBody User user){
User usrFromDb = service.getUserById(userID);
usrFromDb.setFirstName(user.getFirstName());
usrFromDb.setLastName(user.getLastName());
Integer id = service.saveUser(usrFromDb);
return new ResponseEntity<String>("User with '"+ id +"'has been update", HttpStatus.OK);
}
@DeleteMapping("deleteUser/{userID}")
public ResponseEntity<String> deleteUser(@PathVariable("userID") Integer userID){
    service.deleteUser(userID);
    return  new ResponseEntity<String>("User with '"+ userID +"' has been deleted", HttpStatus.OK);
}

}
