package com.example.quizapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText edtNewUser, edtNewPwd, edtNewEmail;
    EditText edtUser, edtPwd;

    FirebaseDatabase database;
    DatabaseReference users;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signup = (Button) findViewById(R.id.signup);
        Button categories = (Button) findViewById(R.id.SignIn);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showSignUpDialog();
                Intent ini = new Intent(MainActivity.this, SignUp.class);
                startActivity(ini);

            }
        });
        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ini = new Intent(MainActivity.this, Categories.class);
                startActivity(ini);
            }
        });

    }
//    private void showSignUpDialog() {
//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
//        alertDialog.setTitle("Sign Up");
//        alertDialog.setMessage("Please fill full information");
//        LayoutInflater inflater = this.getLayoutInflater();
//        View activity_sign_up = inflater.inflate(R.layout.activity_sign_up, null);
//        edtNewUser = (EditText) activity_sign_up.findViewById(R.id.username1);
//        edtNewEmail = (EditText) activity_sign_up.findViewById(R.id.email);
//        edtNewPwd = (EditText) activity_sign_up.findViewById(R.id.password1);
//        alertDialog.setView(activity_sign_up);
//        alertDialog.setIcon(R.drawable.ic_account_circle_black_24dp);
//        alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//
//            }
//        });
//        alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//             final User user=new User(edtNewUser.getText().toString(),edtNewPwd.getText().toString(),edtNewEmail.getText().toString());
//                users.addListenerForSingleValueEvent(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                        if(dataSnapshot.child(user.getUserName()).exists())
//                            Toast.makeText(MainActivity.this,"User already exists",Toast.LENGTH_SHORT).show();
//                        else{
//                            users.child(user.getUserName()).setValue(user);
//                            Toast.makeText(MainActivity.this,"User registration success",Toast.LENGTH_SHORT).show();
//                        }
//
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                    }
//                });
//                dialog.dismiss();
//
//            }
//        });
//        alertDialog.show();
    public void signup(View v){
        EditText ET1=findViewById(R.id.UserName);
        EditText ET2=findViewById(R.id.Password);
        String str1=ET1.getText().toString();
        String str2 = ET2.getText().toString();
        if(str1.isEmpty()|| str2.isEmpty()){
            alertView("Please enter all the values");
            return;
    }


 }

    private void alertView(String msg) {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage(msg);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();

    }
}



//}
