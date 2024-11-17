package pe.com.cibertec.Auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping(value = "login")
    public String login()
    {
        return "Login from public endpoint";
    }

    @PostMapping(value = "register")
    public String register(){
        return "Register from public endpoint";
    }
    

}
