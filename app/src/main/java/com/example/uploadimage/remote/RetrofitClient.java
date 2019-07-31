package com.example.uploadimage.remote;

class RetrofitClient {
    private static final RetrofitClient ourInstance = new RetrofitClient();

    static RetrofitClient getInstance() {
        return ourInstance;
    }

    private RetrofitClient() {
    }
}
