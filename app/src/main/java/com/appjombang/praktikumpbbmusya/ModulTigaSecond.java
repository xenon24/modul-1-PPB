package com.appjombang.praktikumpbbmusya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ModulTigaSecond extends AppCompatActivity{

    TextView t1,t2,t3, t4,t5, t6;
    String name, reg, dept, kota, hobi, tglLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.layout_modultiga_second );

        t1=(TextView) findViewById ( R.id.tvLht1 );
        t2=(TextView) findViewById ( R.id.tvLht2 );
        t3=(TextView) findViewById ( R.id.tvLht3 );
        t4=(TextView)findViewById ( R.id.tvlht4 );
        t5=(TextView )findViewById ( R.id.tvlht5 );
        t6=(TextView )findViewById ( R.id.tvlht6 );

        Intent i= getIntent ();

        name=i.getStringExtra ( "name_key" );
        reg=i.getStringExtra ( "reg_key" );
        dept=i.getStringExtra ( "dept_key" );
        tglLahir=i.getStringExtra ( "tglLahir_key" );
        kota=i.getStringExtra ( "kota_key" );
        hobi=i.getStringExtra ( "hobi_key" );

        t1.setText ( name );
        t2.setText ( reg );
        t3.setText ( dept );
        t4.setText ( tglLahir );
        t5.setText ( kota );
        t6.setText ( hobi );

    }
}
