package kr.hs.emirim.minju0227.simpledialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but = (Button)findViewById(R.id.but_dialog);
        but.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("First id message part.");
        dialog.setMessage("This is message part.");
        dialog.setIcon(R.drawable.freebies_icon);
        dialog.setPositiveButton("확인",null);
        dialog.show();
    }
}
