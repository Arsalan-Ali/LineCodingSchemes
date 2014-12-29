package ali.arsalan.linecodingschemes;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;

public class HowToDialogFragment extends DialogFragment{
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		View v = getActivity().getLayoutInflater()
				.inflate(R.layout.dialog_fragment_how_to_use, null);
		
		return new AlertDialog.Builder(getActivity())
		.setIcon(R.drawable.ic_launcher)
		.setView(v)
		.setTitle(R.string.how_to_use)
		.setPositiveButton("Got it!", null)
		.create();
	}
}
