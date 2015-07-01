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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_list);

        TextView listTitle = (TextView)findViewById(R.id.listTitle);
        listTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ((Button)findViewById(R.id.addItemButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment df = new DialogFragment() {
                    public Dialog onCreateDialog(Bundle b) {
                        AlertDialog.Builder chooseAttributeBuilder = new AlertDialog.Builder(getActivity());
                        chooseAttributeBuilder.setItems(R.array.attributes_array, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which) {
                                    case 0://name
                                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_attribute_name), Toast.LENGTH_LONG).show();
                                        break;
                                    case 1://description
                                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_attribute_description), Toast.LENGTH_LONG).show();
                                        break;
                                    case 2://price
                                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_attribute_price), Toast.LENGTH_LONG).show();
                                        break;
                                    case 3://quantity
                                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_attribute_quantity), Toast.LENGTH_LONG).show();
                                        break;
                                    case 4://priority
                                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_attribute_priority), Toast.LENGTH_LONG).show();
                                        break;
                                    case 5://voice
                                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_attribute_voice), Toast.LENGTH_LONG).show();
                                        break;
                                    case 6://image
                                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_attribute_image), Toast.LENGTH_LONG).show();
                                        break;
                                    case 7://reminder
                                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_attribute_reminder), Toast.LENGTH_LONG).show();
                                        break;
                                    case 8://location
                                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_attribute_location), Toast.LENGTH_LONG).show();
                                        break;
                                    case 9://web-source
                                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_attribute_web_source), Toast.LENGTH_LONG).show();
                                        break;
                                    default:
                                        dismiss();
                                        break;
                                }
                            }
                        });
                        return chooseAttributeBuilder.create();
                    }
                };
                df.show(getFragmentManager(), null);
            }
        });

    }

    public List getList(){
        return this.list;
    }


}
