package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;

import android.app.Activity;

import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置一个Activity的显示界面，
        setContentView(R.layout.activity_main);

        WebView view = (WebView)findViewById(R.id.web_view);
        //设置 WebView 属性，能够执行 Javascript 脚本
        view.getSettings().setJavaScriptEnabled(true);
        //加载需要显示的网页 不能使用局域网地址 只能虚拟机专属地址 http://10.0.2.2 端口是我们vue 项目端口
        view.loadUrl("http://10.0.2.2:5173");

        view.setWebViewClient(new WebViewClient());
    }
}