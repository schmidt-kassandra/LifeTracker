package edu.rose_hulman.lifetracker;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.TextView;

public class NewItemDialog extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle b){
        AlertDialog.Builder newItemBuilder = new AlertDialog.Builder(getActivity());
        newItemBuilder.setTitle();
        return newItemBuilder.create();
    }
}
