package com.example.snipeswipe.pitchit2;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.plus.Plus;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import java.util.ArrayList;

public class SignIn extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, View.OnClickListener {

    private GoogleApiClient mGoogleApiClient;
    String email;
    static String SEND_EMAIL = "MainActivity";


    @Override
    public void onClick(View v)
    {

        if (v.getId() == R.id.sign_in) {
            onSignInClicked();
        }
    }

    private boolean mIsResolving = false;
    private static final String TAG = "MainActivity2";
    private boolean mShouldResolve = false;
    private static final int RC_SIGN_IN = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        findViewById(R.id.sign_in).setOnClickListener(this);


        Button signin =(Button) findViewById(R.id.sign_in);
        Button signup =(Button) findViewById(R.id.sign_out);


        signin.setTextColor(Color.parseColor("#FFFFFF"));
        signup.setTextColor(Color.parseColor("#FFFFFF"));




        ImageView iv= (ImageView) findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.icon);


        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(Plus.API)
                .addScope(new Scope(Scopes.PROFILE))
                .addScope(new Scope(Scopes.EMAIL))
                .build();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "STOPPING!");
        onSignOutClicked();
        super.onStop();
        mGoogleApiClient.disconnect();
    }

    @Override
    public void onConnected(Bundle bundle) {

        Log.d(TAG, "onConnected:" + bundle);
        mShouldResolve = false;

        Toast.makeText(getApplicationContext(), "Signed In", Toast.LENGTH_LONG).show();
        Log.d(TAG, "Signed In");
        email = Plus.AccountApi.getAccountName(mGoogleApiClient);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(SEND_EMAIL, email);
        startActivity(intent);

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    private void onSignInClicked() {

        mShouldResolve = true;
        mGoogleApiClient.connect();

        Log.d(TAG, "Signing in");
    }

    private void onSignOutClicked() {

        if (mGoogleApiClient.isConnected()) {
            Plus.AccountApi.clearDefaultAccount(mGoogleApiClient);
            mGoogleApiClient.disconnect();
        }

        Log.d(TAG, "Signing out");
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult:" + requestCode + ":" + resultCode + ":" + data);

        if (requestCode == RC_SIGN_IN) {

            if (resultCode != RESULT_OK) {
                mShouldResolve = false;
            }

            mIsResolving = false;
            mGoogleApiClient.connect();
        }
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
        Log.d(TAG, "onConnectionFailed:" + connectionResult);

        if (!mIsResolving && mShouldResolve) {
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(this, RC_SIGN_IN);
                    mIsResolving = true;
                } catch (IntentSender.SendIntentException e) {
                    Log.e(TAG, "Could not resolve ConnectionResult.", e);
                    mIsResolving = false;
                    mGoogleApiClient.connect();
                }
            } else {

                Log.d(TAG, "Could not resolve connection ");
            }
        } else {
            Log.d(TAG, "Signed out");
        }
    }

    public void signUp(View view){
        Intent intent = new Intent(SignIn.this, SiginUp.class);
        startActivity(intent);
    }
}
