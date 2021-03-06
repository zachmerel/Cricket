package com.example.android.cricket;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.cricket.R;

public class MainActivity extends AppCompatActivity {

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    String playerOneClose20 = " ";
    String playerOneClose19 = " ";
    String playerOneClose18 = " ";
    String playerOneClose17 = " ";
    String playerOneClose16 = " ";
    String playerOneClose15 = " ";
    String playerOneCloseBB = " ";
    String playerTwoClose20 = " ";
    String playerTwoClose19 = " ";
    String playerTwoClose18 = " ";
    String playerTwoClose17 = " ";
    String playerTwoClose16 = " ";
    String playerTwoClose15 = " ";
    String playerTwoCloseBB = " ";

    TextView text, text2, text3, text4, text5, text6, text7, text8, text9,
            text10, text11, text12, text13, text14, text15, text16, text17,
            text18, text19, text20, text21, text22, text23, text24, text25,
            text26, text27, text28, text29, text30, text31, text32;
    Typeface tfc1, tfc2, tfc3, tfc4, tfc5, tfc6, tfc7, tfc8, tfc9,
            tfc10, tfc11, tfc12, tfc13, tfc14, tfc15, tfc16, tfc17,
            tfc18, tfc19, tfc20, tfc21, tfc22, tfc23, tfc24, tfc25,
            tfc26, tfc27, tfc28, tfc29, tfc30, tfc31, tfc32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Custom font player 1 & reset button.
         */
        text = (TextView) findViewById(R.id.title_cricket);
        text2 = (TextView) findViewById(R.id.player_one_20);
        text3 = (TextView) findViewById(R.id.player_one_20_close);
        text4 = (TextView) findViewById(R.id.player_one_19);
        text5 = (TextView) findViewById(R.id.player_one_19_close);
        text6 = (TextView) findViewById(R.id.player_one_18);
        text7 = (TextView) findViewById(R.id.player_one_18_close);
        text8 = (TextView) findViewById(R.id.player_one_17);
        text9 = (TextView) findViewById(R.id.player_one_17_close);
        text10 = (TextView) findViewById(R.id.player_one_16);
        text11 = (TextView) findViewById(R.id.player_one_16_close);
        text12 = (TextView) findViewById(R.id.player_one_15);
        text13 = (TextView) findViewById(R.id.player_one_15_close);
        text14 = (TextView) findViewById(R.id.player_one_BB);
        text15 = (TextView) findViewById(R.id.player_one_BB_close);
        text16 = (TextView) findViewById(R.id.player_1_score);
        text17 = (TextView) findViewById(R.id.reset_score);


        tfc1 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text.setTypeface(tfc1);
        tfc2 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text2.setTypeface(tfc2);
        tfc3 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text3.setTypeface(tfc3);
        tfc4 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text4.setTypeface(tfc4);
        tfc5 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text5.setTypeface(tfc5);
        tfc6 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text6.setTypeface(tfc6);
        tfc7 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text7.setTypeface(tfc7);
        tfc8 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text8.setTypeface(tfc8);
        tfc9 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text9.setTypeface(tfc9);
        tfc10 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text10.setTypeface(tfc10);
        tfc11 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text11.setTypeface(tfc11);
        tfc12 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text12.setTypeface(tfc12);
        tfc13 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        tfc14 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text14.setTypeface(tfc14);
        tfc15 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text15.setTypeface(tfc15);
        tfc16 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text16.setTypeface(tfc16);
        tfc17 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text17.setTypeface(tfc17);

        /**
         * Custom font player 2.
         */
        text18 = (TextView) findViewById(R.id.player_two_20);
        text19 = (TextView) findViewById(R.id.player_two_20_close);
        text20 = (TextView) findViewById(R.id.player_two_19);
        text21 = (TextView) findViewById(R.id.player_two_19_close);
        text22 = (TextView) findViewById(R.id.player_two_18);
        text23 = (TextView) findViewById(R.id.player_two_18_close);
        text24 = (TextView) findViewById(R.id.player_two_17);
        text25 = (TextView) findViewById(R.id.player_two_17_close);
        text26 = (TextView) findViewById(R.id.player_two_16);
        text27 = (TextView) findViewById(R.id.player_two_16_close);
        text28 = (TextView) findViewById(R.id.player_two_15);
        text29 = (TextView) findViewById(R.id.player_two_15_close);
        text30 = (TextView) findViewById(R.id.player_two_BB);
        text31 = (TextView) findViewById(R.id.player_two_BB_close);
        text32 = (TextView) findViewById(R.id.player_2_score);


        tfc18 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text18.setTypeface(tfc18);
        tfc19 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text19.setTypeface(tfc19);
        tfc20 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text20.setTypeface(tfc20);
        tfc21 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text21.setTypeface(tfc21);
        tfc22 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text22.setTypeface(tfc22);
        tfc23 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text23.setTypeface(tfc23);
        tfc24 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text24.setTypeface(tfc24);
        tfc25 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text25.setTypeface(tfc25);
        tfc26 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text26.setTypeface(tfc26);
        tfc27 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text27.setTypeface(tfc27);
        tfc28 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text28.setTypeface(tfc28);
        tfc29 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text29.setTypeface(tfc29);
        tfc30 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text30.setTypeface(tfc30);
        tfc31 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text31.setTypeface(tfc31);
        tfc32 = Typeface.createFromAsset(getAssets(), "fonts/EraserRegular.ttf");
        text32.setTypeface(tfc32);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * Increase the score for Player 1 by 20 points.
     */
    public void addTwentyForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 20;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Closes out number 20 Player 1.
     */
    public void twentyCloseOutPlayer1(View v) {
        if (playerOneClose20.equals(" ")) {
            playerOneClose20 = "\\";
            display20ClosePlayer1(playerOneClose20);
        } else if (playerOneClose20.equals("\\")) {
            playerOneClose20 = "X";
            display20ClosePlayer1(playerOneClose20);
        } else if (playerOneClose20.equals("X")) {
            playerOneClose20 = "(X)";
            display20ClosePlayer1(playerOneClose20);
        }
    }


    /**
     * Increase the score for Player 1 by 19 points.
     */
    public void addNineteenForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 19;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Closes out number 19 Player 1.
     */
    public void nineteenCloseOutPlayer1(View v) {
        if (playerOneClose19.equals(" ")) {
            playerOneClose19 = "\\";
            display19ClosePlayer1(playerOneClose19);
        } else if (playerOneClose19.equals("\\")) {
            playerOneClose19 = "X";
            display19ClosePlayer1(playerOneClose19);
        } else if (playerOneClose19.equals("X")) {
            playerOneClose19 = "(X)";
            display19ClosePlayer1(playerOneClose19);
        }
    }

    /**
     * Increase the score for Player 1 by 18 points.
     */
    public void addEighteenForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 18;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Closes out number 18 Player 1.
     */
    public void eighteenCloseOutPlayer1(View v) {
        if (playerOneClose18.equals(" ")) {
            playerOneClose18 = "\\";
            display18ClosePlayer1(playerOneClose18);
        } else if (playerOneClose18.equals("\\")) {
            playerOneClose18 = "X";
            display18ClosePlayer1(playerOneClose18);
        } else if (playerOneClose18.equals("X")) {
            playerOneClose18 = "(X)";
            display18ClosePlayer1(playerOneClose18);
        }
    }

    /**
     * Increase the score for Player 1 by 17 points.
     */

    public void addSeventeenForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 17;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Closes out number 17 Player 1.
     */
    public void seventeenCloseOutPlayer1(View v) {
        if (playerOneClose17.equals(" ")) {
            playerOneClose17 = "\\";
            display17ClosePlayer1(playerOneClose17);
        } else if (playerOneClose17.equals("\\")) {
            playerOneClose17 = "X";
            display17ClosePlayer1(playerOneClose17);
        } else if (playerOneClose17.equals("X")) {
            playerOneClose17 = "(X)";
            display17ClosePlayer1(playerOneClose17);
        }
    }

    /**
     * Increase the score for Player 1 by 16 points.
     */
    public void addSixteenForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 16;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Closes out number 16 Player 1.
     */
    public void sixteenCloseOutPlayer1(View v) {
        if (playerOneClose16.equals(" ")) {
            playerOneClose16 = "\\";
            display16ClosePlayer1(playerOneClose16);
        } else if (playerOneClose16.equals("\\")) {
            playerOneClose16 = "X";
            display16ClosePlayer1(playerOneClose16);
        } else if (playerOneClose16.equals("X")) {
            playerOneClose16 = "(X)";
            display16ClosePlayer1(playerOneClose16);
        }
    }

    /**
     * Increase the score for Player 1 by 15 points.
     */
    public void addFifteenForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 15;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Closes out number 15 Player 1.
     */
    public void fifteenCloseOutPlayer1(View v) {
        if (playerOneClose15.equals(" ")) {
            playerOneClose15 = "\\";
            display15ClosePlayer1(playerOneClose15);
        } else if (playerOneClose15.equals("\\")) {
            playerOneClose15 = "X";
            display15ClosePlayer1(playerOneClose15);
        } else if (playerOneClose15.equals("X")) {
            playerOneClose15 = "(X)";
            display15ClosePlayer1(playerOneClose15);
        }
    }

    /**
     * Increase the score for Player 1 by 25 points.
     */
    public void addTwentyfiveForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 25;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Closes out number BB Player 1.
     */
    public void BBCloseOutPlayer1(View v) {
        if (playerOneCloseBB.equals(" ")) {
            playerOneCloseBB = "\\";
            displayBBClosePlayer1(playerOneCloseBB);
        } else if (playerOneCloseBB.equals("\\")) {
            playerOneCloseBB = "X";
            displayBBClosePlayer1(playerOneCloseBB);
        } else if (playerOneCloseBB.equals("X")) {
            playerOneCloseBB = "(X)";
            displayBBClosePlayer1(playerOneCloseBB);
        }
    }

    /**
     * Increase the score for Player 2 by 20 points.
     */
    public void addTwentyForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 20;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Closes out number 20 Player 2.
     */
    public void twentyCloseOutPlayer2(View v) {
        if (playerTwoClose20.equals(" ")) {
            playerTwoClose20 = "\\";
            display20ClosePlayer2(playerTwoClose20);
        } else if (playerTwoClose20.equals("\\")) {
            playerTwoClose20 = "X";
            display20ClosePlayer2(playerTwoClose20);
        } else if (playerTwoClose20.equals("X")) {
            playerTwoClose20 = "(X)";
            display20ClosePlayer2(playerTwoClose20);
        }
    }

    /**
     * Increase the score for Player 2 by 19 points.
     */
    public void addNineteenForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 19;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Closes out number 19 Player 2.
     */
    public void nineteenCloseOutPlayer2(View v) {
        if (playerTwoClose19.equals(" ")) {
            playerTwoClose19 = "\\";
            display19ClosePlayer2(playerTwoClose19);
        } else if (playerTwoClose19.equals("\\")) {
            playerTwoClose19 = "X";
            display19ClosePlayer2(playerTwoClose19);
        } else if (playerTwoClose19.equals("X")) {
            playerTwoClose19 = "(X)";
            display19ClosePlayer2(playerTwoClose19);
        }
    }

    /**
     * Increase the score for Player 2 by 18 points.
     */
    public void addEighteenForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 18;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Closes out number 18 Player 2.
     */
    public void eighteenCloseOutPlayer2(View v) {
        if (playerTwoClose18.equals(" ")) {
            playerTwoClose18 = "\\";
            display18ClosePlayer2(playerTwoClose18);
        } else if (playerTwoClose18.equals("\\")) {
            playerTwoClose18 = "X";
            display18ClosePlayer2(playerTwoClose18);
        } else if (playerTwoClose18.equals("X")) {
            playerTwoClose18 = "(X)";
            display18ClosePlayer2(playerTwoClose18);
        }
    }


    /**
     * Increase the score for Player 2 by 17 points.
     */
    public void addSeventeenForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 17;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Closes out number 17 Player 2.
     */
    public void seventeenCloseOutPlayer2(View v) {
        if (playerTwoClose17.equals(" ")) {
            playerTwoClose17 = "\\";
            display17ClosePlayer2(playerTwoClose17);
        } else if (playerTwoClose17.equals("\\")) {
            playerTwoClose17 = "X";
            display17ClosePlayer2(playerTwoClose17);
        } else if (playerTwoClose17.equals("X")) {
            playerTwoClose17 = "(X)";
            display17ClosePlayer2(playerTwoClose17);
        }
    }

    /**
     * Increase the score for Player 2 by 16 points.
     */
    public void addSixteenForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 16;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Closes out number 16 Player 2.
     */
    public void sixteenCloseOutPlayer2(View v) {
        if (playerTwoClose16.equals(" ")) {
            playerTwoClose16 = "\\";
            display16ClosePlayer2(playerTwoClose16);
        } else if (playerTwoClose16.equals("\\")) {
            playerTwoClose16 = "X";
            display16ClosePlayer2(playerTwoClose16);
        } else if (playerTwoClose16.equals("X")) {
            playerTwoClose16 = "(X)";
            display16ClosePlayer2(playerTwoClose16);
        }
    }

    /**
     * Increase the score for Player 2 by 15 points.
     */
    public void addFifteenForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 15;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Closes out number 15 Player 2.
     */
    public void fifteenCloseOutPlayer2(View v) {
        if (playerTwoClose15.equals(" ")) {
            playerTwoClose15 = "\\";
            display15ClosePlayer2(playerTwoClose15);
        } else if (playerTwoClose15.equals("\\")) {
            playerTwoClose15 = "X";
            display15ClosePlayer2(playerTwoClose15);
        } else if (playerTwoClose15.equals("X")) {
            playerTwoClose15 = "(X)";
            display15ClosePlayer2(playerTwoClose15);
        }
    }

    /**
     * Increase the score for Player 1 by 25 points.
     */
    public void addTwentyfiveForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 25;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Closes out number BB Player 1.
     */
    public void BBCloseOutPlayer2(View v) {
        if (playerTwoCloseBB.equals(" ")) {
            playerTwoCloseBB = "\\";
            displayBBClosePlayer2(playerTwoCloseBB);
        } else if (playerTwoCloseBB.equals("\\")) {
            playerTwoCloseBB = "X";
            displayBBClosePlayer2(playerTwoCloseBB);
        } else if (playerTwoCloseBB.equals("X")) {
            playerTwoCloseBB = "(X)";
            displayBBClosePlayer2(playerTwoCloseBB);
        }
    }

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Player 2.
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the close for 20 for Player 1.
     */
    public void display20ClosePlayer1(String close) {
        TextView playerOneTwentyClose = findViewById(R.id.player_one_20_close);
        playerOneTwentyClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 19 for Player 1.
     */
    public void display19ClosePlayer1(String close) {
        TextView playerOneNineteenClose = findViewById(R.id.player_one_19_close);
        playerOneNineteenClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 18 for Player 1.
     */
    public void display18ClosePlayer1(String close) {
        TextView playerOneEighteenClose = findViewById(R.id.player_one_18_close);
        playerOneEighteenClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 17 for Player 1.
     */
    public void display17ClosePlayer1(String close) {
        TextView playerOneSeventeenClose = findViewById(R.id.player_one_17_close);
        playerOneSeventeenClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 16 for Player 1.
     */
    public void display16ClosePlayer1(String close) {
        TextView playerOneSixteenClose = findViewById(R.id.player_one_16_close);
        playerOneSixteenClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 15 for Player 1.
     */
    public void display15ClosePlayer1(String close) {
        TextView playerOneFifteenClose = findViewById(R.id.player_one_15_close);
        playerOneFifteenClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for BB for Player 1.
     */
    public void displayBBClosePlayer1(String close) {
        TextView playerOneTwentyfiveClose = findViewById(R.id.player_one_BB_close);
        playerOneTwentyfiveClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 20 for Player 2.
     */
    public void display20ClosePlayer2(String close) {
        TextView playerTwoTwentyClose = findViewById(R.id.player_two_20_close);
        playerTwoTwentyClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 19 for Player 2.
     */
    public void display19ClosePlayer2(String close) {
        TextView playerTwoNineteenClose = findViewById(R.id.player_two_19_close);
        playerTwoNineteenClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 18 for Player 2.
     */
    public void display18ClosePlayer2(String close) {
        TextView playerTwoEighteenClose = findViewById(R.id.player_two_18_close);
        playerTwoEighteenClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 17 for Player 2.
     */
    public void display17ClosePlayer2(String close) {
        TextView playerTwoSeventeenClose = findViewById(R.id.player_two_17_close);
        playerTwoSeventeenClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 16 for Player 2.
     */
    public void display16ClosePlayer2(String close) {
        TextView playerTwoSixteenClose = findViewById(R.id.player_two_16_close);
        playerTwoSixteenClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for 15 for Player 2.
     */
    public void display15ClosePlayer2(String close) {
        TextView playerTwoFifteenClose = findViewById(R.id.player_two_15_close);
        playerTwoFifteenClose.setText(String.valueOf(close));
    }

    /**
     * Displays the close for BB for Player 2.
     */
    public void displayBBClosePlayer2(String close) {
        TextView playerTwoTwentyfiveClose = findViewById(R.id.player_two_BB_close);
        playerTwoTwentyfiveClose.setText(String.valueOf(close));
    }

    /**
     * Reset the score.
     */
    public void resetScore(View v) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        playerOneClose20 = " ";
        playerOneClose19 = " ";
        playerOneClose18 = " ";
        playerOneClose17 = " ";
        playerOneClose16 = " ";
        playerOneClose15 = " ";
        playerOneCloseBB = " ";
        playerTwoClose20 = " ";
        playerTwoClose19 = " ";
        playerTwoClose18 = " ";
        playerTwoClose17 = " ";
        playerTwoClose16 = " ";
        playerTwoClose15 = " ";
        playerTwoCloseBB = " ";
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
        display20ClosePlayer1(playerOneClose20);
        display19ClosePlayer1(playerOneClose19);
        display18ClosePlayer1(playerOneClose18);
        display17ClosePlayer1(playerOneClose17);
        display16ClosePlayer1(playerOneClose16);
        display15ClosePlayer1(playerOneClose15);
        displayBBClosePlayer1(playerOneCloseBB);
        display20ClosePlayer2(playerTwoClose20);
        display19ClosePlayer2(playerTwoClose19);
        display18ClosePlayer2(playerTwoClose18);
        display17ClosePlayer2(playerTwoClose17);
        display16ClosePlayer2(playerTwoClose16);
        display15ClosePlayer2(playerTwoClose15);
        displayBBClosePlayer2(playerTwoCloseBB);


    }
}
