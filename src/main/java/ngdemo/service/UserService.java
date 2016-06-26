package ngdemo.service;

import ngdemo.model.json.Login;

public class UserService {

    public Login getDefaultLogin() {
        Login login = new Login();
        login.setUsername("daniel");
        login.setPassword("aaa");
        return login;
    }
}
