package offpay.fintech.com.offpay.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import offpay.fintech.com.offpay.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TransferFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TransferFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TransferFragment extends Fragment implements View.OnClickListener{


    public TransferFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TransferFragment.
     */
    // TODO: Rename and change types and number of parameters

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.main_fragment_page, container, false);
        ImageView transfer = (ImageView)view.findViewById(R.id.transfer_money);
        ImageView recieve = (ImageView)view.findViewById(R.id.recieve_money);
        transfer.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.transfer_money:
                Toast.makeText(getActivity(),"Transfer Selected",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
