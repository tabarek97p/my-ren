package com.dalel_najaf.codeforiraq.org.dalelnajaf;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar supportToolbar=findViewById(R.id.supportv7_toolbar);
        setSupportActionBar(supportToolbar);
        mainGrid = findViewById(R.id.mainGrid);
        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // ألاصلي

                 //   Intent intent = new Intent(MainActivity.this,ActivityHistoryNajaf.class);
                //    intent.putExtra("info","This is activity from card item index  "+finalI);
              //      startActivity(intent);

                    // مني
                    if (finalI == 0){ // open ActivityHolyPlacese
                        Intent intent1 = new Intent(MainActivity.this,ActivityHolyPlacese.class);
                        startActivity(intent1); }
                    else  if (finalI == 1){ // open ActivityHistoryNajaf
                        Intent intent1 = new Intent(MainActivity.this,ActivityHistoryNajaf.class);
                        startActivity(intent1); }
                    else  if (finalI == 2){ // open ActivityHistoricalPlaces
                        Intent intent1 = new Intent(MainActivity.this,ActivityHistoricalPlaces.class);
                        startActivity(intent1); }
                    else  if (finalI == 3){ // open ActivityFunPlaces
                        Intent intent1 = new Intent(MainActivity.this,ActivityFunPlaces.class);
                        startActivity(intent1); }
                    else  if (finalI == 4){ // open ActivityShoppingPlaces
                        Intent intent1 = new Intent(MainActivity.this,ActivityShoppingPlaces.class);
                        startActivity(intent1); }
                    else  if (finalI == 5){ // open ActivityUnivercityPlaces
                        Intent intent1 = new Intent(MainActivity.this,ActivityUnivercityPlaces.class);
                        startActivity(intent1); }
                    else  if (finalI == 6){ // open ActivityHospitalPlaces
                        Intent intent1 = new Intent(MainActivity.this,ActivityHospitalPlaces.class);
                        startActivity(intent1); }
                    else  if (finalI == 7){ // open ActivitySubsPlaces
                        Intent intent1 = new Intent(MainActivity.this,ActivitySubsPlaces.class);
                        startActivity(intent1); }
                    else  if (finalI == 8){ // open ActivityAirportPlaces
                        Intent intent1 = new Intent(MainActivity.this,ActivityAirportPlaces.class);
                        startActivity(intent1); }
                    else  if (finalI == 9){ // open ActivityFootballPlaces
                        Intent intent1 = new Intent(MainActivity.this,ActivityFootballPlaces.class);
                        startActivity(intent1); }
                    else  if (finalI == 10){ // open ActivityFoodPlaces
                        Intent intent1 = new Intent(MainActivity.this,ActivityFoodPlaces.class);
                       startActivity(intent1);
                       }
                    else  if (finalI == 11){ // open Places
                        Intent intent1 = new Intent(MainActivity.this,Dr_najaf.class);
                        startActivity(intent1); }
// end onclick
                }
            });}}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_app, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()) {

        case R.id.about_as:
        Intent intent2 = new Intent(MainActivity.this,ActivityAboutUs.class);
        startActivity(intent2);
        return true;
        case R.id.rate:
             RateClass.RateApp(getApplicationContext());
             return true;
          case R.id.message:
          /*    try{
              Intent sendemall = new Intent(Intent.ACTION_SEND);
              sendemall.setData(Uri.parse("mailto:"));
              sendemall.setType(("message/rfc822"));
              sendemall.putExtra(Intent.EXTRA_EMAIL,"dalel.alnajaf.1@gmail.com");
              sendemall.putExtra(Intent.EXTRA_SUBJECT,"عنوان الرسالة");
              sendemall.putExtra(Intent.EXTRA_TEXT,"موضوع الرسالة");
              startActivity(sendemall);}
              catch(Exception e) {Toast.makeText(this,"عذراً لا يوجد تطبيق بريد",Toast.LENGTH_LONG).show();}*/
              SendAnEmail();
              return true;

      default:

        return super.onOptionsItemSelected(item);
        }}
    private void SendAnEmail() {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "dalel.alnajaf.1@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "رأيي بالتطبيق");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }
        }
