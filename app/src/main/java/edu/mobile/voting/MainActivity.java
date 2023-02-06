package edu.mobile.voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView validateId;
    private TextInputEditText getVoterid;
    private TextInputEditText get_otp;
    private TextInputLayout setLayoutVisible;
    public Button submitButton;
    String voterID;
    ArrayList<String> dbVoter = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        validateId = findViewById(R.id.idVerify);
        getVoterid = findViewById(R.id.editVoterid);
        setLayoutVisible = findViewById(R.id.layoutText2);
        get_otp = findViewById(R.id.edit_otp);
        submitButton = findViewById(R.id.btn_submit);


        dbVoter.add("HAR9080490");
        dbVoter.add("WED3202385");
        dbVoter.add("THE9344981");
        dbVoter.add("LOV1431431");

        validateId.setOnClickListener(view -> {
            voterID = getVoterid.getText().toString().trim();
            if(dbVoter.contains(voterID)){
                setLayoutVisible.setVisibility(View.VISIBLE);
                submitButton.setVisibility(View.VISIBLE);
            }else {
                submitButton.setVisibility(View.INVISIBLE);
                setLayoutVisible.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(), "Invalid Voter ID", Toast.LENGTH_SHORT).show();
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), VoterDetails.class));
            }
        });
    }

}