package com.appjombang.praktikumpbbmusya;

/**
 * Created by Musya Rizal on 3/30/2018.
 */
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModulDua extends AppCompatActivity{

    int ch=1;
    float font=30;
    int text=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.layout_moduldua );

        final TextView t=(TextView) findViewById ( R.id.halo );
        Button b1 = (Button) findViewById ( R.id.tombolsatu );
        b1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                t.setTextSize ( font );
                font = font + 5;
                if (font == 50)
                    font =30;
            }
        } );
        Button b2 = (Button) findViewById ( R.id.tomboldua );
        b2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                switch (ch){
                    case 1:
                        t.setTextColor ( Color.RED );
                        break;
                    case 2:
                        t.setTextColor ( Color.GREEN );
                        break;
                    case 3:
                        t.setTextColor ( Color.BLUE );
                        break;
                    case 4:
                        t.setTextColor ( Color.CYAN );
                        break;
                    case 5:
                        t.setTextColor ( Color.YELLOW );
                        break;
                    case 6:
                        t.setTextColor ( Color.MAGENTA );
                        break;
                }
                ch++;
                if(ch==7)
                    ch=1;
            }
        } );
        Button b3 = (Button) findViewById ( R.id.tomboltiga );
        b3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                switch (text){
                    case 1:
                        t.setText ( "Dunia Pagi" );
                        break;
                    case 2:
                        t.setText ( "Dunia Siang" );
                        break;
                    case 3:
                        t.setText ( "Dunia Sore" );
                        break;
                    case 4:
                        t.setText ( "Dunia Malam" );
                        break;
                    default:
                        t.setText ( "Hello World" );
                        text=0;
                }
                text++;
            }
        } );

    }
}
