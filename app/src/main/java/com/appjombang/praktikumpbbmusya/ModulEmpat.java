package com.appjombang.praktikumpbbmusya;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.ListActivity;
import android.database.Cursor;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class ModulEmpat extends ListActivity {

    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_modulempat);


        Button ambilKontak = (Button) findViewById ( R.id.getKontak );
        ambilKontak.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
                startManagingCursor(cursor);
                String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER,
                        ContactsContract.CommonDataKinds.Phone._ID};
                int[] to = {android.R.id.text1, android.R.id.text2};
                SimpleCursorAdapter listadapter = new SimpleCursorAdapter(ModulEmpat.this, android.R.layout.simple_list_item_2, cursor, from, to);
                setListAdapter(listadapter);
                Toast.makeText(ModulEmpat.this, "Seluruh Kontak Anda Berhasil Ditampilkan.", Toast.LENGTH_SHORT).show();
            }
        } );
    }
}
