package com.example.srikanthreddykarka.loginapp;

import com.example.srikanthreddykarka.loginapp.viewmodel.userModel;



import junit.framework.Assert;


import org.mockito.Mockito;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    public void validateEmail(){
        userModel ce = Mockito.mock(userModel.class);
        Mockito.when(ce.getEmail()).thenReturn("abc@xyz.com");
        String email=ce.getEmail();
        Assert.assertEquals("abc@xyz.com",email);
    }

    public void validatePassword(){
        userModel ce = Mockito.mock(userModel.class);
        Mockito.when(ce.getPassword()).thenReturn("abc123");
        String password=ce.getEmail();
        Assert.assertEquals("abc123",password);
    }
}