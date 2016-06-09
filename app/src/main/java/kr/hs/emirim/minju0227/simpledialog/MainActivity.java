package kr.hs.emirim.minju0227.simpledialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String[] items={"젤리빈","킷캣","롤리팝"};
    boolean[] checkArr={false, true, false};
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = (Button)findViewById(R.id.but_dialog);
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
        /*dialog.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                but.setText(items[which]);
            }
        });*/
        dialog.setSingleChoiceItems(items, 0,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                but.setText(items[which]);
            }
    });
        dialog.setIcon(R.drawable.freebies_icon);
        dialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"대화상자의 확인 버튼을 클릭했음!",Toast.LENGTH_LONG).show();
                    }
        });
        dialog.show();
    }
}
