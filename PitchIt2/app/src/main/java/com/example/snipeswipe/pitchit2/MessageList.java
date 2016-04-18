package com.example.snipeswipe.pitchit2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;

public class MessageList extends AppCompatActivity {

    TableRow row1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_list);

        ImageView iv1 = (ImageView)findViewById(R.id.image2);
        iv1.setImageResource(R.drawable.girl);
        ImageView iv2 = (ImageView)findViewById(R.id.image2);
        iv2.setImageResource(R.drawable.boy);
        ImageView iv3 = (ImageView)findViewById(R.id.image3);
        iv3.setImageResource(R.drawable.giroud5);

//        TableRow row1 = (TableRow) findViewById(R.id.row1);
//        TableRow row2 = (TableRow) findViewById(R.id.row2);
//        TableRow row3 = (TableRow) findViewById(R.id.row3);


//        row1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                 final Intent open = new Intent(MessageList.this, ChatActivity.class);
//                 startActivity(open);
//            }
//        });
//
//        row2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Intent open = new Intent(MessageList.this, ChatActivity.class);
//                startActivity(open);
//            }
//        });
//
//        row3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Intent open = new Intent(MessageList.this, ChatActivity.class);
//                startActivity(open);
//            }
//        });
    }

    public void runChat(View view){
//        Log.d("Test", "Test");
        Intent intent = new Intent(MessageList.this, ChatActivity.class);
        startActivity(intent);
    }
}
