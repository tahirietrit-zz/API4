package com.tahirietrit.api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tahirietrit.api.callbacks.RegisterCallback;
import com.tahirietrit.api.model.User;

public class MainActivity extends AppCompatActivity implements RegisterCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url = "http://appsix.net/paintbook/index.php?RegisterUser=&" +
                "User=aa222aa&" +
                "password=adidas&" +
                "Emri=Filan&" +
                "Mbiemri=Fisteku";
        new RegisterAsycTask(this).execute(url);
    }

    @Override
    public void onRegisterResponse(User user, boolean status) {
        System.out.println("user "+ user.toString());
    }
}