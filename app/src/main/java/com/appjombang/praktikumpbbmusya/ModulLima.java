package com.appjombang.praktikumpbbmusya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ModulLima extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.layout_modullima );
    }

    public void onButtonClick ( View v ) {
        FragmentTwo fragmentTwo = (FragmentTwo) getFragmentManager ().findFragmentById ( R.id.fragment_two);

        switch ( v. getId ()) {
            case R. id . btn_one_create_new :
                if ( fragmentTwo == null ) {

                    Intent i = new Intent ( this , ModulLimaDrawing.class );
                    startActivity ( i );
                } else {

                    Toast. makeText ( this , "Will be implemented later" , Toast. LENGTH_SHORT ) . show ();
                }
                break ;
            case R. id . btn_one_open_existing :
                Toast. makeText ( this , "Will be implemented later" , Toast. LENGTH_SHORT ) . show ();
                break ;
            default :
        }
    }
}
