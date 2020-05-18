package com.gktech.navigationgraph;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final NavController navController= Navigation.findNavController(this,R.id.my_nav_host_fragment);
       // NavigationUI.setupActionBarWithNavController(this,Navigation.findNavController(this,R.id.my_nav_host_fragment));


        BottomNavigationView navigationView=findViewById(R.id.bottom_nav);
        //NavigationUI.setupWithNavController(navigationView, navController);
       navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               switch (item.getItemId()){


                   case R.id.home:
                       navController.navigate(R.id.firstFragment);
                       break;
                   case R.id.search:
                       navController.navigate(R.id.secondFragment);
                       break;
                   case R.id.account:
                       navController.navigate(R.id.thiredFragment);
                       break;

               }
               return true;
           }
       });


    }

    @Override
    public void onBackPressed() {
        finishAffinity();
        super.onBackPressed();
    }
}
