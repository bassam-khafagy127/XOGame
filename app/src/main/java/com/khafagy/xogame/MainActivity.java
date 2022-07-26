package com.khafagy.xogame;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView x_score_tv, o_score_tv;
    ImageView reset;
    CardView btn1, btn2,
            btn3, btn4,
            btn5, btn6,
            btn7, btn8,
            btn9;
    String btn1_signe = "", btn2_signe = "", btn3_signe = "",
            btn4_signe = "", btn5_signe = "", btn6_signe = "",
            btn7_signe = "", btn8_signe = "", btn9_signe = "";
    private static final String X_SIGNE = "X_Signe";
    private static final String O_SIGNE = "O_Signe";
    private static final String X_Turn = "x_turn";
    private static final String O_Turn = "o_turn";
    private static final String TAG = "clicked";

    //this line of code make x player as default player
    String general_turn = X_Turn;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x_score_tv = findViewById(R.id.x_score);
        o_score_tv = findViewById(R.id.o_score);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        reset = findViewById(R.id.reset_btn);
        reset.setOnClickListener(view -> {
            reset_game();
            Log.d(TAG, "reset.is clicked");

        });
        reset_game();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                setValues(general_turn, btn1);
                Log.d(TAG, "btn1.is clicked");
                break;
            case R.id.btn2:
                setValues(general_turn, btn2);
                Log.d(TAG, "btn2.is clicked");
                break;
            case R.id.btn3:
                setValues(general_turn, btn3);
                Log.d(TAG, "btn3.is clicked");
                break;
            case R.id.btn4:
                setValues(general_turn, btn4);
                Log.d(TAG, "btn4.is clicked");
                break;
            case R.id.btn5:
                setValues(general_turn, btn5);
                Log.d(TAG, "btn5.is clicked");
                break;
            case R.id.btn6:
                setValues(general_turn, btn6);
                Log.d(TAG, "btn6.is clicked");
                break;
            case R.id.btn7:
                setValues(general_turn, btn7);
                Log.d(TAG, "btn7.is clicked");
                break;
            case R.id.btn8:
                setValues(general_turn, btn8);
                Log.d(TAG, "btn8.is clicked");
                break;
            case R.id.btn9:
                setValues(general_turn, btn9);
                Log.d(TAG, "btn9.is clicked");
                break;
        }
    }

    public void setValues(String turn, CardView btn) {
        switch (btn.getId()) {
            case R.id.btn1:
                if (turn == X_Turn && Objects.equals(btn1_signe, "")) {
                    btn1.setBackgroundResource(R.drawable.ic_x_va);
                    btn1_signe = X_SIGNE;
                    check_winner();
                    general_turn = O_Turn;
                } else if (turn == O_Turn && Objects.equals(btn1_signe, "")) {
                    btn1.setBackgroundResource(R.drawable.ic_o_va);
                    btn1_signe = O_SIGNE;
                    check_winner();
                    general_turn = X_Turn;
                }
                break;

            case R.id.btn2:
                if (turn == X_Turn && Objects.equals(btn2_signe, "")) {
                    btn2.setBackgroundResource(R.drawable.ic_x_va);
                    btn2_signe = X_SIGNE;
                    check_winner();
                    general_turn = O_Turn;
                } else if (turn == O_Turn && Objects.equals(btn2_signe, "")) {
                    btn2.setBackgroundResource(R.drawable.ic_o_va);
                    btn2_signe = O_SIGNE;
                    check_winner();
                    general_turn = X_Turn;
                }
                counter++;
                break;
            case R.id.btn3:
                if (turn == X_Turn && Objects.equals(btn3_signe, "")) {
                    btn3.setBackgroundResource(R.drawable.ic_x_va);
                    btn3_signe = X_SIGNE;
                    check_winner();
                    general_turn = O_Turn;
                } else if (turn == O_Turn && Objects.equals(btn3_signe, "")) {
                    btn3.setBackgroundResource(R.drawable.ic_o_va);
                    btn3_signe = O_SIGNE;
                    check_winner();
                    general_turn = X_Turn;
                }
                break;
            case R.id.btn4:
                if (turn == X_Turn && Objects.equals(btn4_signe, "")) {
                    btn4.setBackgroundResource(R.drawable.ic_x_va);
                    btn4_signe = X_SIGNE;
                    check_winner();
                    general_turn = O_Turn;

                } else if (turn == O_Turn && Objects.equals(btn4_signe, "")) {
                    btn4.setBackgroundResource(R.drawable.ic_o_va);
                    btn4_signe = O_SIGNE;
                    check_winner();
                    general_turn = X_Turn;
                }
                break;
            case R.id.btn5:
                if (turn == X_Turn && Objects.equals(btn5_signe, "")) {
                    btn5.setBackgroundResource(R.drawable.ic_x_va);
                    btn5_signe = X_SIGNE;
                    check_winner();
                    general_turn = O_Turn;
                } else if (turn == O_Turn && Objects.equals(btn5_signe, "")) {
                    btn5.setBackgroundResource(R.drawable.ic_o_va);
                    btn5_signe = O_SIGNE;
                    check_winner();
                    general_turn = X_Turn;
                }
                break;
            case R.id.btn6:
                if (turn == X_Turn && Objects.equals(btn6_signe, "")) {
                    btn6.setBackgroundResource(R.drawable.ic_x_va);
                    btn6_signe = X_SIGNE;
                    check_winner();
                    general_turn = O_Turn;
                } else if (turn == O_Turn && Objects.equals(btn6_signe, "")) {
                    btn6.setBackgroundResource(R.drawable.ic_o_va);
                    btn6_signe = O_SIGNE;
                    check_winner();
                    general_turn = X_Turn;
                }
                break;
            case R.id.btn7:
                if (turn == X_Turn && Objects.equals(btn7_signe, "")) {
                    btn7.setBackgroundResource(R.drawable.ic_x_va);
                    btn7_signe = X_SIGNE;
                    check_winner();
                    general_turn = O_Turn;
                } else if (turn == O_Turn && Objects.equals(btn7_signe, "")) {
                    btn7.setBackgroundResource(R.drawable.ic_o_va);
                    btn7_signe = O_SIGNE;
                    check_winner();
                    general_turn = X_Turn;
                }
                break;
            case R.id.btn8:
                if (turn == X_Turn && Objects.equals(btn8_signe, "")) {
                    btn8.setBackgroundResource(R.drawable.ic_x_va);
                    btn8_signe = X_SIGNE;
                    general_turn = O_Turn;
                } else if (turn == O_Turn && Objects.equals(btn8_signe, "")) {
                    btn8.setBackgroundResource(R.drawable.ic_o_va);
                    btn8_signe = X_SIGNE;
                    check_winner();
                    general_turn = X_Turn;
                }
                break;
            case R.id.btn9:
                if (turn == X_Turn && Objects.equals(btn9_signe, "")) {
                    btn9.setBackgroundResource(R.drawable.ic_x_va);
                    btn9_signe = X_SIGNE;
                    check_winner();
                    general_turn = O_Turn;
                } else if (turn == O_Turn && Objects.equals(btn9_signe, "")) {
                    btn9.setBackgroundResource(R.drawable.ic_o_va);
                    btn9_signe = O_SIGNE;
                    check_winner();
                    general_turn = X_Turn;
                }
                break;
            case R.id.reset_btn:
                reset_game();
                break;
        }

    }

    public void check_winner() {
        // player X Win
        if (
                btn1_signe == X_SIGNE && btn2_signe == X_SIGNE && btn3_signe == X_SIGNE
                        || btn1_signe == X_SIGNE && btn4_signe == X_SIGNE && btn7_signe == X_SIGNE
                        || btn1_signe == X_SIGNE && btn5_signe == X_SIGNE && btn9_signe == X_SIGNE
                        || btn2_signe == X_SIGNE && btn5_signe == X_SIGNE && btn8_signe == X_SIGNE
                        || btn3_signe == X_SIGNE && btn6_signe == X_SIGNE && btn9_signe == X_SIGNE
                        || btn3_signe == X_SIGNE && btn5_signe == X_SIGNE && btn7_signe == X_SIGNE
                        || btn4_signe == X_SIGNE && btn5_signe == X_SIGNE && btn6_signe == X_SIGNE
                        || btn7_signe == X_SIGNE && btn8_signe == X_SIGNE && btn9_signe == X_SIGNE) {

            Toast.makeText(this, "player x", Toast.LENGTH_SHORT).show();
            dialogBuilder("Player X is Winne ");

        }
        if (
                btn1_signe == O_SIGNE && btn2_signe == O_SIGNE && btn3_signe == O_SIGNE
                        || btn1_signe == O_SIGNE && btn4_signe == O_SIGNE && btn7_signe == O_SIGNE
                        || btn1_signe == O_SIGNE && btn5_signe == O_SIGNE && btn9_signe == O_SIGNE
                        || btn2_signe == O_SIGNE && btn5_signe == O_SIGNE && btn8_signe == O_SIGNE
                        || btn3_signe == O_SIGNE && btn6_signe == O_SIGNE && btn9_signe == O_SIGNE
                        || btn3_signe == O_SIGNE && btn5_signe == O_SIGNE && btn7_signe == O_SIGNE
                        || btn4_signe == O_SIGNE && btn5_signe == O_SIGNE && btn6_signe == O_SIGNE
                        || btn7_signe == O_SIGNE && btn8_signe == O_SIGNE && btn9_signe == O_SIGNE) {

            Toast.makeText(this, "player o", Toast.LENGTH_SHORT).show();
            dialogBuilder("Player O is Winne");
        }


    }

    public void reset_game() {
        btn1_signe = "";
        btn2_signe = "";
        btn3_signe = "";
        btn4_signe = "";
        btn5_signe = "";
        btn6_signe = "";
        btn7_signe = "";
        btn8_signe = "";
        btn9_signe = "";
        btn1.setBackground(null);
        btn2.setBackground(null);
        btn3.setBackground(null);
        btn4.setBackground(null);
        btn5.setBackground(null);
        btn6.setBackground(null);
        btn7.setBackground(null);
        btn8.setBackground(null);
        btn9.setBackground(null);

    }

    public void dialogBuilder(String win) {
        AlertDialog.Builder winner = new AlertDialog.Builder(this)
                .setTitle("Congratulation")
                .setMessage(win).setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        reset_game();
                    }
                });
        AlertDialog alertDialog = winner.create();
        alertDialog.show();
    }
}