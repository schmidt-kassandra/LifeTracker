package edu.rose_hulman.lifetracker;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MakeList extends ActionBarActivity {

    private List list = new List();
    protected boolean cursorVisibility = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_list);

        final TextView listTitle = (TextView)findViewById(R.id.listTitle);
        listTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listTitle.setCursorVisible(!cursorVisibility);
            }

        });

        ((Button)findViewById(R.id.addItemButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewAttributeDialog newItemDialog = new NewAttributeDialog();
                newItemDialog.show(getFragmentManager(), null);
            }
        });

    }

    public List getList(){
        return this.list;
    }


}
