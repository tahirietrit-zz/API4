package com.tahirietrit.api;

import android.os.AsyncTask;

import com.tahirietrit.api.callbacks.RegisterCallback;
import com.tahirietrit.api.model.RegisterResponse;

import org.json.JSONException;

import java.io.IOException;

/**
 * Created by macb on 15/12/17.
 */

public class RegisterAsycTask extends AsyncTask<String, String, String> {
    RegisterCallback callback;
    public RegisterAsycTask(RegisterCallback callback){
     this.callback = callback;
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... strings) {
        try {
            return ApiService.get(strings[0]);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        try {
            RegisterResponse response = new RegisterResponse(s);
            callback.onRegisterResponse(response.getUser(), response.getMessage()==null);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
