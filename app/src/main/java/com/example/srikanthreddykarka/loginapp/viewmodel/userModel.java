package com.example.srikanthreddykarka.loginapp.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.widget.Toast;

import com.example.srikanthreddykarka.loginapp.BR;

public class userModel extends BaseObservable {

    private String email, password, statusCode;

    String username="abc@xyz.com";
    String pass="abc123";

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() { return password; }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        notifyPropertyChanged(BR.statusCode);
    }

    public void check(String email, String password){
        if(email.equalsIgnoreCase(username) && password.equals(pass)){
            setStatusCode("200");
        } else{
            setStatusCode("400");
        }


    }
}
