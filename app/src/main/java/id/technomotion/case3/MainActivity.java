package id.technomotion.case3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextPlayer1, editTextPlayer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPlayer1 = (EditText) findViewById(R.id.editText1);
        editTextPlayer2 = (EditText) findViewById(R.id.editText2);
    }
    public void onNextButtonClicked(View view){
        startActivity(new Intent(this,Main2Activity.class));
    }
}
