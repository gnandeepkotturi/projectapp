package com.example.projeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.navigation.NavigationView;

import java.net.URI;

public class Navigationmenu extends AppCompatActivity  {
NavigationView nv;
TextView t_name,t_email;
ImageView pro_pic;
DrawerLayout dl;
ActionBarDrawerToggle at;
//FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationmenu);
        dl=findViewById(R.id.dLayout);
        nv=findViewById(R.id.nav);
         //      fm=getSupportFragmentManager();
        at=new ActionBarDrawerToggle(this,dl,R.string.open,R.string.close);
        dl.addDrawerListener(at);
        at.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       Intent i=getIntent();
        String Uname=i.getStringExtra("name");
        String Uemail=i.getStringExtra("email");
        String Upic=i.getStringExtra("pic");
        View v=nv.getHeaderView(0);
        t_name=v.findViewById(R.id.name);
        t_email=v.findViewById(R.id.email);
        pro_pic=v.findViewById(R.id.profile_image);
        t_name.setText(Uname);
        t_email.setText(Uemail);
        Glide.with(this).load(Upic).into(pro_pic);

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        /*Fragment fg = getSupportFragmentManager().findFragmentById(R.id.main_container);
                        getSupportFragmentManager().beginTransaction().remove(fg).commit();*/
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Home_frag()).commit();
                        dl.closeDrawers();
                        break;
                    case R.id.courses:
                        /*Fragment fg1 = getSupportFragmentManager().findFragmentById(R.id.main_container);
                        getSupportFragmentManager().beginTransaction().remove(fg1).commit();*/
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Courses()).commit();
                        dl.closeDrawers();
                        break;
                    case R.id.facultyinfo:
                       /* Fragment fg2 = getSupportFragmentManager().findFragmentById(R.id.main_container);
                        getSupportFragmentManager().beginTransaction().remove(fg2).commit();*/
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Faculty()).commit();
                        dl.closeDrawers();
                        break;
                    case R.id.results:
                       /* Fragment fg3 = getSupportFragmentManager().findFragmentById(R.id.main_container);
                        fm.beginTransaction().remove(fg3).commit();*/
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Results()).commit();
                        dl.closeDrawers();
                        break;
                    case R.id.feedback:
                       /* Fragment fg4 = fm.findFragmentById(R.id.main_container);
                        fm.beginTransaction().remove(fg4).commit();*/
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Feedback()).commit();
                        dl.closeDrawers();
                        break;
                    case R.id.complaints:
                       /* Fragment fg5 = fm.findFragmentById(R.id.main_container);
                        fm.beginTransaction().remove(fg5).commit();*/
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Complaints()).commit();
                        dl.closeDrawers();
                        break;
                    case R.id.notification:
                       /* Fragment fg2 = getSupportFragmentManager().findFragmentById(R.id.main_container);
                        getSupportFragmentManager().beginTransaction().remove(fg2).commit();*/
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Notifcations()).commit();
                        dl.closeDrawers();
                        break;
                    case R.id.Acheivements:
                       /* Fragment fg6 = fm.findFragmentById(R.id.main_container);
                        fm.beginTransaction().remove(fg6).commit();*/
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Acheivements()).commit();
                        dl.closeDrawers();
                        break;
                    case R.id.events:
                       /* Fragment fg6 = fm.findFragmentById(R.id.main_container);
                        fm.beginTransaction().remove(fg6).commit();*/
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Events()).commit();
                        dl.closeDrawers();
                        break;
                    case R.id.adminlogin:
                       /* Fragment fg6 = fm.findFragmentById(R.id.main_container);
                        fm.beginTransaction().remove(fg6).commit();*/
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new Adminlogin()).commit();
                        dl.closeDrawers();
                        break;
                    case R.id.logout:

                        dl.closeDrawers();

                }
                return true;

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(at.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

}
