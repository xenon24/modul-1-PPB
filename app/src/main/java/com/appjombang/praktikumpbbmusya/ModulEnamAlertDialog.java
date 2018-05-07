package com.appjombang.praktikumpbbmusya;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class ModulEnamAlertDialog extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity()).setIcon(android.R.drawable.stat_notify_error)
                .setTitle("Pemberitahuan!")
                .setMessage("ini adalah sebuah pesan, hanya menampilkan pesan pemberitahuan yang tidak ada artinya jika anda telah membacanya tekan selesai dan jika anda tidak ingin membacanya tekan keluar.")
                .setPositiveButton("Selesai", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Terima kasih", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Keluar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Keluar", Toast.LENGTH_SHORT).show();
                    }
                }).create();
    }
}
